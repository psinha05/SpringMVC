<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page isELIgnored="false"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 class="text-center"> ${hd}</h1>
<h1 style="color:green"> ${msg }</h1>
<hr>
<%-- for @ModelAttribue data to be shown here --%>
 <h1> Welcome, ${contact.name } </h1>
 <h1> Your Email address is ${contact.email } </h1>
 <h1> Your Password is ${contact.password }, try to secure it ! </h1>
 
 
<%-- Method (2) for @RequestParam data to be shown here --%>
<%-- <h1> Welcome to final JSP Page</h1>
<h1> Name is ${n} </h1>
<h1> Email is ${e} </h1>
<h1> Password is ${p} </h1> --%>



</body>
</html>