package ca.sheridancollege.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ca.sheridancollege.beans.DogBean;
import ca.sheridancollege.dao.DAO;
import ca.sheridancollege.enums.*;

public class AddDog extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String owner = request.getParameter("owner-name");
		String dog = request.getParameter("dog-name");
		String breed = request.getParameter("dog-breed");
		String group = request.getParameter("dog-group");
		String ownerEmail = request.getParameter("owner-email");
		String friday = request.getParameter("friday");
		String saturday = request.getParameter("saturday");
		String sunday = request.getParameter("sunday");
		
		DogGender gender = DogGender.getGender(request.getParameter("dog-gender"));
		DogSpecialty speciality = DogSpecialty.getSpeciality(request.getParameter("dog-speciality"));
		
		DogBean db = new DogBean();
		
		db.setOwnerName(owner);
		db.setDogName(dog);
		db.setDogBreed(breed);
		db.setDogGroup(group);
		db.setDogGender(gender);
		db.setDogSpeciality(speciality);
		db.setOwnerEmail(ownerEmail);

		db.setFriday(friday == null ? false : true);
		db.setSaturday(saturday == null ? false : true);
		db.setSunday(sunday == null ? false : true);
		
		DAO.addDog(db);
		
		HttpSession session = request.getSession();
		
		db = DAO.getDog("SELECT * FROM dogs WHERE dogname='" + dog + "' AND ownername='" + owner + "'");
		
		session.setAttribute("db", db);
		
		request.getRequestDispatcher("MailOut").forward(request, response);		
	}
}