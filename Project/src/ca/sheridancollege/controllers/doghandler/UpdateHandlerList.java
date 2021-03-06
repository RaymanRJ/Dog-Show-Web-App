package ca.sheridancollege.controllers.doghandler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.sheridancollege.dao.DAO;

public class UpdateHandlerList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getUserPrincipal().getName();
		String[] dogNumbers = request.getParameterValues("DogNumber");
		
		for(String s : dogNumbers) {
			DAO.updateDogHandler(username, dogNumbers);
		}
		
		request.getRequestDispatcher("handlerMain").forward(request, response);
	}

}
