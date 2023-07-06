<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="save">
		Id: <input type="text" name="id" id="id"><br>
		<br> Name: <input type="text" name="name" id="name"><br>
		<br> Age: <input type="text" name="age" id="age"><br>
		<br> Salary: <input type="text" name="sal" id="sal"><br>
		<br> Email: <input type="text" name="email" id="email"><br>
		<br> Password: <input type="text" name="password" id="password"><br>
		<br>

		<button type="submit">Save</button>
	</form>
</body>
</html>