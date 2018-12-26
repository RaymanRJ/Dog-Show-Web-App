package ca.sheridancollege.controllers.doghandler;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.sheridancollege.beans.DogBean;
import ca.sheridancollege.dao.DAO;

public class BuildHandlerListPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String username = request.getUserPrincipal().getName();
		ArrayList<DogBean> dogs = DAO.getDogs();
		ArrayList<Integer> currentDogs = DAO.getCurrentList(username);

		request.getSession().setAttribute("dogs", dogs);
		request.getSession().setAttribute("currentDogs", currentDogs);
		
		request.getRequestDispatcher("addHandlerDog").forward(request, response);
	}

}
