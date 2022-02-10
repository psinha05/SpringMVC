<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>


<h2>Submitted Student Information</h2>
	<table border="1">
		<tbody>
			<tr>
            <td>Name :</td>
            <td>${name}</td>
        </tr>
        <tr>
            <td>ID :</td>
            <td>${id}</td>
        </tr>
			<tr>
				<td>Student Age</td>
				<td>${age}</td>
			</tr>
		</tbody>
	</table>
	Your hidden name is ${student.hiddenMsg}
</body>
</html>