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


@WebServlet("/Enroll")
public class Enroll extends HttpServlet {
	
	public static Map<Integer, String> courses = new HashMap();
	public static Integer course_id=0;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String course = request.getParameter("Course");
		courses.put(course_id+1, course);
		response.sendRedirect("welcome.jsp");
	}

}
