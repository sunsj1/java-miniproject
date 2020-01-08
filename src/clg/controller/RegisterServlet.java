package clg.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import clg.model.UserInformation;
import clg.serviceImplementation.ServiceImplementation;
import clg.serviceInterface.ServiceInterface;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserInformation u = new UserInformation();
		u.setName(request.getParameter("name"));
		u.setMobile(request.getParameter("mobile"));
		u.setEmail(request.getParameter("email"));
		u.setGender(request.getParameter("gender"));
		u.setRole(request.getParameter("role"));
		u.setSub1(request.getParameter("sub1"));
		u.setSub2(request.getParameter("sub2"));
		u.setSub3(request.getParameter("sub3"));
		u.setSub4(request.getParameter("sub4"));
		u.setSub5(request.getParameter("sub5"));
		u.setSub6(request.getParameter("sub6"));
		String subject = "";
		if (u.getSub1() != null) {
			subject = subject + " " + u.getSub1();
		}
		if (u.getSub2() != null) {
			subject = subject + " " + u.getSub2();
		}
		if (u.getSub3() != null) {
			subject = subject + " " + u.getSub3();
		}
		if (u.getSub4() != null) {
			subject = subject + " " + u.getSub4();
		}
		if (u.getSub5() != null) {
			subject = subject + " " + u.getSub5();
		}
		if (u.getSub6() != null) {
			subject = subject + " " + u.getSub6();
		}
		u.setSubject(subject);
		u.setCountry(request.getParameter("country"));
		u.setState(request.getParameter("state"));
		u.setCity(request.getParameter("city"));
		u.setPassword(request.getParameter("password"));
		u.setCollegeName(request.getParameter("collegeName"));
		ServiceInterface si = new ServiceImplementation();
        
		int id=si.registerdata(u);
		
		if (id!=0) {
			request.setAttribute("msg", "Registration Successfull");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		else {
			request.setAttribute("msg", "Something Went Wrong");
			request.getRequestDispatcher("Error.jsp").forward(request, response);
			
		}
	}

}
