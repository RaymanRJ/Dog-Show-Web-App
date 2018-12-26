package ca.sheridancollege.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.sheridancollege.beans.DogBean;
import ca.sheridancollege.dao.DAO;

public class UpdateDog extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String q = "";
		
		q = "UPDATE dogs SET dogname='";
		q += request.getParameter("dog-name");
		q += "', ownername='";
		q += request.getParameter("owner-name");
		q += "', dogbreed='";
		q += request.getParameter("dog-breed");
		q += "', doggroup='";
		q += request.getParameter("dog-group");
		q += "', doggender='";
		q += request.getParameter("dog-gender");
		q += "', dogclassspeciality='";
		q += request.getParameter("dog-speciality");
		q += "' WHERE id='";
		q += request.getParameter("dog-number");
		q += "'";
		
		DAO.updateDog(q);
		
		q = "SELECT * FROM dogs WHERE id=" + request.getParameter("dog-number");
		
		DogBean db = DAO.getDog(q);
		
		request.setAttribute("dogBean", db);
		request.getRequestDispatcher("viewDog").forward(request, response);
	}

}
