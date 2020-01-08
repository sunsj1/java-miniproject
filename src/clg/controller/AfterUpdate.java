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
@WebServlet("/save")
public class AfterUpdate extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			System.out.println(request.getParameter("name"));
			UserInformation u1 = new UserInformation();
			int id=Integer.parseInt(request.getParameter("id"));
			u1.setId(id);
			u1.setName(request.getParameter("name"));
			u1.setMobile(request.getParameter("mobile"));
			u1.setEmail(request.getParameter("email"));
			u1.setGender(request.getParameter("gender"));
			u1.setRole(request.getParameter("role"));
			u1.setSub1(request.getParameter("sub1"));
			u1.setSub2(request.getParameter("sub2"));
			u1.setSub3(request.getParameter("sub3"));
			u1.setSub4(request.getParameter("sub4"));
			u1.setSub5(request.getParameter("sub5"));
			u1.setSub6(request.getParameter("sub6"));
			String subject = "";
			if (u1.getSub1() != null) {
				subject = subject + " " + u1.getSub1();
			}
			if (u1.getSub2() != null) {
				subject = subject + " " + u1.getSub2();
			}
			if (u1.getSub3() != null) {
				subject = subject + " " + u1.getSub3();
			}
			if (u1.getSub4() != null) {
				subject = subject + " " + u1.getSub4();
			}
			if (u1.getSub5() != null) {
				subject = subject + " " + u1.getSub5();
			}
			if (u1.getSub6() != null) {
				subject = subject + " " + u1.getSub6();
			}
			u1.setSubject(subject);
			u1.setCountry(request.getParameter("country"));
			u1.setState(request.getParameter("state"));
			u1.setCity(request.getParameter("city"));
			u1.setPassword(request.getParameter("password"));
			u1.setCollegeName(request.getParameter("collegeName"));
			ServiceInterface si = new ServiceImplementation();
		
			System.out.println(u1);
			if (u1!=null) {
				si.updateData(u1);
				
				request.setAttribute("msg", "Data Updated Successfully");
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			} else {
                  request.setAttribute("msg", "something went wrong record not updated");
                  request.getRequestDispatcher("Login.jsp").forward(request, response);
			}
		}

}
