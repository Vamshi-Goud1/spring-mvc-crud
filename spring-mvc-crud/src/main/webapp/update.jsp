<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#form {
	border: 2px solid;
	width: fit-content;
	border-radius: 10pxs;
}
#button{
	margin: 0% auto;
}
</style>
</head>
<body>
	<center>
		<h1>Update The Teacher</h1>
		<form:form action="updateteacher" modelAttribute="teacher" >
			<table cellspacing="10px" cellpadding="10px">
				<tr>
					<td>ID</td>
					<td><form:input path="id" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>NAME</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>AGE</td>
					<td><form:input path="age" /></td>
				</tr>
				<tr>
					<td>SALARY</td>
					<td><form:input path="sal" /></td>
				</tr>
				<tr>
					<td>EMAIL</td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td>PASSWORD</td>
					<td><form:input path="password" /></td>
				</tr>

				<tr>
					<td colspan="2"><center><input type="submit" value="UPDATE" id="button"></center></td>
				</tr>
			</table>
		</form:form>
	</center>
</body>
</html>