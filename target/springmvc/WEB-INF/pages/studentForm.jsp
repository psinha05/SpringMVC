<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>

<title>Spring MVC Form Handling</title>
</head>
<h2>Student Data Form</h2>
<form:form action="addStudent" method="POST">
	<table>
		<tbody>
			<tr>
				<td><form:label path="studId">Student ID:</form:label></td>
				<td><form:input path="studId"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="name">StudentName :</form:label></td>
				<td><form:input path="name"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="age">Student Age:</form:label></td>
				<td><form:input path="age"></form:input></td>
			</tr>
			
			 <tr>               
                <form:hidden path="hiddenMsg"/>
            </tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" />
				</td>
			</tr>
		</tbody>
	</table>
</form:form>
</body>
</html>