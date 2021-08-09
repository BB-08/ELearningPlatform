package com.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Admin")
public class Admin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Iterator it = Register.users.entrySet().iterator();
		int i=0;
		
		while (it.hasNext()) {
            Map.Entry mapElement = (Map.Entry)it.next();
            User user = (User)mapElement.getValue();
            out.println(i+1 + ") " + mapElement.getKey() + " : " + user.getEmail() + " : " + user.getPhone() + " : " + user.getAddress());
        }
	}

	

}
