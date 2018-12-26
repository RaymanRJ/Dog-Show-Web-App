package ca.sheridancollege.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ca.sheridancollege.beans.DogBean;
import ca.sheridancollege.dao.DAO;

public class SearchForDogs extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		String category = request.getParameter("search-topic");
		switch(category) {
			case "ID":
				category="id";
				break;
			case "dog-name":
				category="dogname";
				break;
			case "owner-name":
				category="ownername";
				break;
			case "dog-breed":
				category="dogbreed";
				break;
			default:
				category="doggroup";
				break;
		}
		
		String value = request.getParameter("search-question");
		
		ArrayList<DogBean> dogs = DAO.getDogs(category, value);
		session.setAttribute("dogs", dogs);
		
		request.getRequestDispatcher("viewAllDogs").forward(request, response);
	}
}
