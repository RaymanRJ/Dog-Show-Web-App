package ca.sheridancollege.controllers.doghandler;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.sheridancollege.beans.DogBean;
import ca.sheridancollege.dao.DAO;

public class HandlerMain extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getUserPrincipal().getName();
		
		ArrayList<DogBean> dogBeans = DAO.getDogs();
		ArrayList<Integer> currentDogs = DAO.getCurrentList(username);
		
		dogBeans.clear();
		for(Integer i : currentDogs) {
			String q = "select * from dogs where id='" + i + "'";
			dogBeans.add(DAO.getDog(q));
		}
		
		request.getSession().setAttribute("dogBeans", dogBeans);
		
		request.getRequestDispatcher("handlerMainPage").forward(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}
