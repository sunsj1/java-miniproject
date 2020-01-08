package clg.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clg.model.UserInformation;
import clg.serviceImplementation.ServiceImplementation;
import clg.serviceInterface.ServiceInterface;


@WebServlet("/facultyInfo")
public class FacultyInfo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServiceInterface si=new ServiceImplementation();
		List<UserInformation> facultyList=si.facultyList();
		if (facultyList!=null) {
			request.setAttribute("data", facultyList);
			request.getRequestDispatcher("Facultyview.jsp").forward(request, response);
		} else {
             request.setAttribute("msg", "No faculty Available");
             request.getRequestDispatcher("AllView.jsp");
		}
		
	}

}
