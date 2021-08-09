<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		if(session.getAttribute("Username")==null){
			response.sendRedirect("login.jsp");
		}
	%>
	This is welcome page.<br>
	<a href="courses.jsp">Click here to view the courses you have enrolled in.</a><br>
	<label for="course">Choose a course to enroll in:</label>
	<form action="Enroll" method="post">
	<select name="Course" id="course">
		<option value="C++">C++</option>
		<option value="Java">Java</option>
		<option value="SQL">SQL</option>
		<option value="UNIX">UNIX</option>
		<option value="Python">Python</option>
	</select>
	<input type="submit" value="Enroll">
	</form>
	<form action="Logout">
		<input type="submit" value="Logout">
	</form>
</body>
</html>