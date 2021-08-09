package com.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	public static int user_id=0;
	public static Map<String, User> users = new HashMap();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String password = request.getParameter("password");
		user_id=user_id+1;
		User user = new User(user_id, username, email, password, address, phone);
		users.put(username, user);
		System.out.println(users.get(username).getUsername());
		
		
		PrintWriter out = response.getWriter();
		out.println("You have been successfully registered");
		response.sendRedirect("login.jsp");
		
	}

}
