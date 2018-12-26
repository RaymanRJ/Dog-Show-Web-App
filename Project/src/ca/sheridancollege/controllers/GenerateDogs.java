package ca.sheridancollege.controllers;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.sheridancollege.beans.DogBean;
import ca.sheridancollege.dao.DAO;
import ca.sheridancollege.enums.*;

public class GenerateDogs extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Random r = new Random(System.currentTimeMillis());

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		for(int i = 0; i < 100; i++) {
			DogBean db = new DogBean();
			
			db.setOwnerName(OwnerName.getRandomOwnerName().toString());
			db.setDogBreed(DogBreed.getRandomDogBreed().toSaveString());
			db.setDogGender(DogGender.getRandomGender());
			db.setDogGroup(DogGroup.getRandomGroup().toString());
			db.setDogName(DogName.getRandomDogName().toString());
			db.setDogSpeciality(DogSpecialty.getRandomSpeciality());
			db.setOwnerEmail(makeEmail());
			db.setFriday(r.nextBoolean());
			db.setSaturday(r.nextBoolean());
			db.setSunday(r.nextBoolean());
			
			DAO.addDog(db);
		}
		
		request.getRequestDispatcher("home").forward(request,response);
	}
	
	private String makeEmail() {
		String email = "";
		String alphanumeric = "abcdefghijklmnopqrstuvwxyz0123456789";
		
		for(int i = 0; i < r.nextInt(10) + 1; i++) {
			email += alphanumeric.charAt(r.nextInt(alphanumeric.length()-1));
		}
		
		email += "@";

		for(int i = 0; i < r.nextInt(5) + 1; i++) {
			email += alphanumeric.charAt(r.nextInt(alphanumeric.length()-1));
		}
		
		email += ".com";
		
		return email;
		
	}

}
