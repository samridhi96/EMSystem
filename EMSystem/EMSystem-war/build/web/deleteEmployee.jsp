<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="shortcut icon" type="image/x-icon" href="favicon.ico" />
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<title>Delete Employee</title>
<style>
body {
	background: lavenderblush;
}

h1 {
	text-align: center;
}

.legend {
	background-color: #555;
	color: #fff;
	font-size: 30px;
	text-align: center;
	margin-left: 0%;
	margin-right: 25%;
	width: 50%;
}

.customBtn {
	border: black;
	font-size: 20px;
	padding: 5px 22px;
	color: black;
	border-radius: 8px;
	cursor: pointer;
	margin-left: 86.7%;
	width: 13%;
}

.customBtn:hover {
	border: black;
	font-size: 20px;
	padding: 5px 22px;
	color: black;
	background-color: lightcoral;
	border-radius: 8px;
	cursor: pointer;
}

input[type=number] {
	padding: 12px 20px;
	margin: 8px 0;
	box-sizing: border-box;
	border: none;
	border-bottom: black;
	-webkit-transition: 0.5s;
	transition: 0.5s;
	outline: none;
}

input[type=number]:focus {
	border: 3px solid #555;
}

input[type=submit] {
	border: black;
	font-size: 20px;
	padding: 5px 22px;
	color: black;
	background-color: white;
	border-radius: 8px;
	cursor: pointer;
	display: block;
	margin-left: 40%;
	margin-right: 50%;
	width: 20%;
}

input[type=submit]:hover {
	border: black;
	font-size: 20px;
	padding: 5px 22px;
	color: white;
	background-color: black;
	border-radius: 8px;
	cursor: pointer;
}

table.center {
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>
<body>
	<hr>
	<h1>Delete Employee</h1>
	<hr>
	<button class="customBtn" onclick="window.location='home.jsp'">
		Home</button>
	<hr>
	<br>
	<form name="deleteEmpForm" action="DeleteServlet" method="post"
		autocomplete="off" onsubmit="return validateForm()">
		<fieldset>
			<legend class="legend">Enter Employee Id</legend>
			<br>
			<table class="center">
				<tr>
					<th><input type="text" id="eId" name="employeeId" required
						autofocus /><br></th>
				</tr>
			</table>
			<br> <br> <input type="submit" value="Delete Employee" />
			<br>
		</fieldset>
	</form>
</body>
</html>