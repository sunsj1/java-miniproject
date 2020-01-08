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

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServiceInterface si=new ServiceImplementation();
		int id=Integer.parseInt(request.getParameter("id"));
		
		System.out.println(id);
		UserInformation u1=si.getArecord(id);
		System.out.println("from page");
		System.out.println(u1.getId());
		System.out.println(u1.getName());
		UserInformation u = new UserInformation();
		u.setId(u1.getId());
		u.setName(u1.getName());
		u.setMobile(u1.getMobile());
		u.setEmail(u1.getEmail());
		u.setGender(u1.getGender());
		u.setRole(u1.getRole());
		u.setSub1(u1.getSub1());
		u.setSub2(u1.getSub2());
		u.setSub3(u1.getSub3());
		u.setSub4(u1.getSub4());
		u.setSub5(u1.getSub5());
		u.setSub6(u1.getSub6());
		u.setCountry(u1.getCountry());
		u.setState(u1.getState());
		u.setCity(u1.getCity());
		u.setPassword(u1.getPassword());
		u.setCollegeName(u1.getCollegeName());
		
		if (u!=null) {
			request.setAttribute("data", u);
			request.getRequestDispatcher("Update.jsp").forward(request, response);
		}
		else {
			request.setAttribute("msg", "Something Went Wrong");
			request.getRequestDispatcher("Error.jsp").forward(request, response);
		}
			
			
	}

}
