package ca.sheridancollege.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ca.sheridancollege.beans.BreedBean;
import ca.sheridancollege.beans.ListBean;
import ca.sheridancollege.dao.DAO;
import ca.sheridancollege.enums.DogGender;
import ca.sheridancollege.enums.DogGroup;
import ca.sheridancollege.enums.DogSpecialty;

public class ViewDogGroups extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		HashMap<DogGroup, ArrayList<BreedBean>> dogGroupMap = DogGroupMap.getDogGroupMap();
				
		session.setAttribute("dogMap", dogGroupMap);
		
		System.out.println("HERE");
		request.getRequestDispatcher("viewDogGroupsPage").forward(request, response);
	}
}
