<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test page</title>
</head>
<body>
<h1>my test page</h1>

<%
 String name = (String) request.getAttribute("name");
String add = (String) request.getAttribute("add");
Integer no = (Integer) request.getAttribute("contact");
 LocalDateTime TimeNow =(LocalDateTime) request.getAttribute("time");
%>

 <h1> My Name is <%= name %></h1>
 <h2> My Address is <%=add %></h2>
 <h3> My contact is <%= no %></h3>
 <h4>Current time is <%=TimeNow %></h4>
</body>
</html>