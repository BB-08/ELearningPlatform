package com.project;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		if(uname.equals("abcd") && pass.equals("efgh")) {
			HttpSession session = request.getSession();
			session.setAttribute("Username", uname);
			response.sendRedirect("welcome.jsp");
		}
		else if(Register.users.containsKey(uname) && pass.equals(Register.users.get(uname).getPassword())) {
			HttpSession session = request.getSession();
			session.setAttribute("Username", uname);
			response.sendRedirect("welcome.jsp");
		}
		else if(uname.equals("admin") && pass.equals("admin")) {
			HttpSession session = request.getSession();
			session.setAttribute("Username", uname);
			response.sendRedirect("adminWelcome.jsp");
		}
		else {
			response.sendRedirect("login.jsp");
		}
	}

	
	

}
