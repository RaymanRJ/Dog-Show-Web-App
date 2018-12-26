package ca.sheridancollege.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.sheridancollege.beans.DogBean;
import ca.sheridancollege.dao.DAO;

public class ViewDogPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String q = "Select * from dogs where id='";
		q += request.getParameter("dog-number");
		q += "'";
		
		DogBean db = DAO.getDog(q);
		
		String pic = "Images/Dogs/" + ((int) (Math.random() * 22)) + ".jpg";
		
		request.getSession().setAttribute("dogBean", db);
		request.getSession().setAttribute("pic", pic);

		request.getRequestDispatcher("viewDogPage").forward(request, response);
	}

}
