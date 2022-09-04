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
<title>EMS Login</title>
<style>
body {
	background: lavenderblush;
}

h1 {
	text-align: center;
}

div.form {
	display: block;
	text-align: center;
}

form {
	margin-left: 25%;
	margin-right: 25%;
	width: 50%;
}

.legend {
	background-color: #555;
	color: #fff;
	font-size: 35px;
	text-align: center;
	margin-left: 0%;
	margin-right: 25%;
	width: 50%;
}

input[type=text], input[type=password] {
	padding: 12px 20px;
	margin: 8px 0;
	box-sizing: border-box;
	border: none;
	border-bottom: black;
	-webkit-transition: 0.5s;
	transition: 0.5s;
	outline: none;
}

input[type=text]:focus, input[type=password]:focus {
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
</style>
</head>
<body>
	<hr>
	<h1>Employee Management System</h1>
	<hr>
	<br>
	<br>
	<div class="form">
		<form name="loginForm" action="LoginServlet" method="POST"
			style="width: 786px;" autocomplete="off">
			<fieldset>
				<legend class="legend">Login Credentials</legend>
				<br> <input id="eId" type="text" name="username"
					placeholder="Enter Username" autofocus required /><br>
				<br> <input id="pwd" type="password" name="password"
					placeholder="Enter Password"  required><br>
				<br> <input type="submit" value="Login"><br> <br>
			</fieldset>
                </form>
	</div>
</body>
</html>