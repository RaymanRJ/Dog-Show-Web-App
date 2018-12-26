package ca.sheridancollege.controllers.email;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ca.sheridancollege.beans.DogBean;

public class MailOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			DogBean db = (DogBean) request.getSession().getAttribute("db");
			
			String subject = "Registration Confirmation: " + db.getDogName();
			
			String body = db.getOwnerName() + " You have successfully registered for the show!";
			body += "\n\nYou have registered " + db.getDogName() + ":";
			body += "\nRegistration Number: " + db.getDogNumber();
			
			body += "\n\nBreed:\t" + db.getDogBreed();
			body += "\nGroup:\t" + db.getDogGroup().toString();
			body += "\nGender:\t" + db.getDogGender().toString();
			body += "\nDog Type: " + db.getDogSpeciality().toString();
			
			body += "\n\nYou have signed up for the following shows:";
			body += db.getFriday() ? "\n\tFriday" : "";
			body += db.getSaturday() ? "\n\tSaturday" : "";
			body += db.getSunday() ? "\n\tSunday" : "";
			
			body += "\n\nWe look forward to seeing you there!";
			
			String from = EmailStrings.from;
			String to = db.getOwnerEmail();
			String password = EmailStrings.password;
			
			// Code that sends e-mail:
			Properties props = new Properties();
			props.put("mail.transport.protocol", "smtps");
			props.put("mail.smtps.host", "smtp.gmail.com");
			props.put("mail.smtps.port",  "465");
			props.put("mail.smtps.auth", "true");
			props.put("mail.smtps.quitwait", "false");
			Session session = Session.getDefaultInstance(props);
			
			// Create message:
			Message message = new MimeMessage(session);
			message.setSubject(subject);
			message.setText(body);
			
			// Address the message:
			Address fromAddress = new InternetAddress(from);
			Address toAddress = new InternetAddress(to);
			message.setFrom(fromAddress);
			message.setRecipient(Message.RecipientType.TO, toAddress);
			
			// Send the message:
			Transport transport = session.getTransport();
			transport.connect(from, password);
			transport.sendMessage(message, message.getAllRecipients());
			
		} catch (MessagingException e) {
			System.out.println("Could not send e-mail.");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		request.getRequestDispatcher("home").forward(request, response);
		
	}

}
