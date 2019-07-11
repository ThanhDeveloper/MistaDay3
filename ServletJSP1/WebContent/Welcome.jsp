<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="obj" class="demo.vn.Caculator"></jsp:useBean>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%	
	String name=request.getParameter("uname");
	out.print("Welcome "+name);
	%>
	<%@ page import="java.util.Date" %>  
		Today is: <%= new Date()
	%> 
	<%
		int m=obj.cube(5);
		out.print("Cube is "+m);
	%> 
</body>
</html>