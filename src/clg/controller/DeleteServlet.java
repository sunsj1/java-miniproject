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

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		ServiceInterface si=new ServiceImplementation();
		
		int i=si.deleteData(id);
		if (i!=0) {
			request.setAttribute("msg", "Record Deleted Successfully");
			request.getRequestDispatcher("AllView.jsp").forward(request, response);
		} else {
           request.setAttribute("msg", "Something Went Wrong");
           request.getRequestDispatcher("Error.jsp").forward(request, response);
		}
		
		
	}

}
