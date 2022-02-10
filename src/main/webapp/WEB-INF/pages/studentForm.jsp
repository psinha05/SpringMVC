<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>

<title>Spring MVC Form Handling</title>
</head>
<h2>Student Data Form</h2>
<form:form action="add" method="POST" modelAttribute="student">
	<table>
		<tbody>
		
		 <tr>
                <td>Enter your ID:</td>
                <td><form:input path="studId" /></td>
                <td><form:errors path="studId" cssStyle="color: #ff0000;" /></td>
            </tr>
           
            <tr>
                <td>Enter your Name:</td>
                <td><form:password path="name"  showPassword="true"/></td>
                <td><form:errors path="name" cssStyle="color: #ff0000;"/></td>
            </tr>
			<%-- <tr>
				<td><form:label path="studId">Student ID:</form:label></td>
				<td><form:input path="studId"></form:input></td>
				<td><form:errors path="studId" cssStyle="color: #ff0000;" /></td>
			</tr>
			<tr>
				<td><form:label path="name">StudentName :</form:label></td>
				<td><form:input path="name"></form:input></td>
				<td><form:errors path="name" cssStyle="color: #ff0000;" /></td>
			</tr> --%>
			<tr>
				<td><form:label path="age">Student Age:</form:label></td>
				<td><form:input path="age"></form:input></td>
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