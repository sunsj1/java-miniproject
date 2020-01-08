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


@WebServlet("/studentInfo")
public class StudentInfo extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServiceInterface si=new ServiceImplementation();
		List<UserInformation> studentList=si.studentList();
		if (studentList!=null) {
			request.setAttribute("data", studentList);
			request.getRequestDispatcher("StudentView.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "No Student Available");
            request.getRequestDispatcher("AllView.jsp");
		}
	
		}

}
