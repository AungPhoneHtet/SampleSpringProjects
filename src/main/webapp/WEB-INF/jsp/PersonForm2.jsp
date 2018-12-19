<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Validation Example</title>
<!-- Access the bootstrap Css like this, 
		Spring boot will handle the resource mapping automcatically -->
<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/4.0.0/css/bootstrap.min.css" />
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body class="bg-light">
	<div align="center">
		<h2>Spring MVC Form Validation Example - Registration Form 2</h2>
		<h3>Validation with Spring Validator Interface</h3>
		<br><br>
		<table border="0" width="90%">
			<form:form method="post" modelAttribute="person2" action="/register2">
				<tr>
					<td align="left" width="20%">Name:</td>
					<td align="left" width="40%"><form:input path="name" size="50"/></td>
					<td align="left"><form:errors path="name" cssClass="error"/></td>
				</tr>
				<tr>
					<td align="left" width="20%">Age:</td>
					<td align="left" width="40%"><form:input path="age" size="50" /></td>
					<td align="left"><form:errors path="age" cssClass="error" /></td>
				</tr>
				<tr>
					<td align="left" width="20%">Email:</td>
					<td align="left" width="40%"><form:input path="email"
							size="50" /></td>
					<td align="left"><form:errors path="email" cssClass="error" /></td>
				</tr>
				<tr>
					<td align="left" width="20%">Contact Number:</td>
					<td align="left" width="40%"><form:input path="contactNumber"
							size="50" /></td>
					<td align="left"><form:errors path="contactNumber"
							cssClass="error" /></td>
				</tr>
				<tr>
					<td align="left" width="20%">About Me:</td>
					<td align="left" width="40%"><form:textarea path="aboutMe"
							style="width:80%" /></td>
					<td align="left"><form:errors path="aboutMe" cssClass="error" /></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td align="left"><input type="submit" value="Register" class="btn btn-primary" /></td>
					<td></td>
				</tr>
			</form:form>
		</table>
	</div>
	<script type="text/javascript"
		src="webjars/jquery/3.3.1-1/jquery.min.js"></script>
	<script type="text/javascript"
		src="webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>