package clg.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.User;

import clg.model.UserInformation;
import clg.serviceImplementation.ServiceImplementation;
import clg.serviceInterface.ServiceInterface;

@WebServlet("/login")
public class LoginServelet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServiceInterface si=new ServiceImplementation();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		UserInformation i=si.validUser(email, password);
		List<UserInformation> slist=new  ArrayList<UserInformation>();
		HttpSession httpSession=request.getSession();
		if (i==null) {
			request.setAttribute("msg", "Wrong Credentials");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		else {
			
			if (i.getRole().equals("Head Of Deaprtment")) {
				request.getRequestDispatcher("AllView.jsp").forward(request, response);
				
			}
			else if (i.getRole().equals("Assistance Proffessor")) {
				List<UserInformation> studentList=si.studentList();
				request.setAttribute("data", studentList);
				request.getRequestDispatcher("StudentView1.jsp").forward(request, response);
			}
			else if (i.getRole().equals("Student")) {
				slist.add(i);
				request.setAttribute("data", slist);
				request.getRequestDispatcher("Demo.jsp").forward(request, response);
			} 
			else {
				request.setAttribute("msg","You not belonging from these branch");
				request.getRequestDispatcher("Error.jsp").forward(request, response);
			}
			
			
		}
	}

}
