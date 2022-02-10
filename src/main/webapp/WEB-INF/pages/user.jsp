<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC Form Page</title>
</head>
<body>

	<h2>Fill the below detials in the form</h2>
	<form:form method="post" modelAttribute="user" action="register">

		<table>

			<tr>
				<td>Enter your name:</td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssStyle="color:#ff0000;" /></td>
			</tr>

			<tr>
				<td>Enter your email:</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssStyle="color:#ff0000'" /></td>
			</tr>


			<tr>
				<td><input type="submit" name="submit" value="Register"></td>
			</tr>
		
		</table>

	</form:form>


</body>
</html>