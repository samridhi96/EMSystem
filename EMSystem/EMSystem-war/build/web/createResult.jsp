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

<title>Create Employee</title>
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

input[type=number], input[type=text], input[type=date], input[type=email]
	{
	padding: 12px 20px;
	margin: 8px 0;
	box-sizing: border-box;
	border: none;
	border-bottom: black;
	-webkit-transition: 0.5s;
	transition: 0.5s;
	outline: none;
}

input[type=number]:focus, input[type=text]:focus, input[type=date]:focus,
	input[type=email]:focus {
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
	text-align: center;
	margin-left: 32%;
	margin-right: 25%;
	width: 35%;
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

:root { -
	-radius: 3px; -
	-baseFg: black; -
	-baseBg: white; -
	-accentFg: white; -
	-accentBg: black;
}

select {
	font: 400 12px/1.3 sans-serif;
	-webkit-appearance: none;
	appearance: none;
	color: var(- -baseFg);
	border: 1px solid var(- -baseFg);
	line-height: 1;
	outline: 0;
	padding: 0.65em 2.5em 0.55em 0.75em;
	border-radius: var(- -radius);
	background-color: var(- -baseBg);
	background-image: linear-gradient(var(- -baseFg), var(- -baseFg)),
		linear-gradient(-135deg, transparent 50%, var(- -accentBg) 50%),
		linear-gradient(-225deg, transparent 50%, var(- -accentBg) 50%),
		linear-gradient(var(- -accentBg) 42%, var(- -accentFg) 42%);
	background-repeat: no-repeat, no-repeat, no-repeat, no-repeat;
	background-size: 1px 100%, 20px 22px, 20px 22px, 20px 100%;
	background-position: right 20px center, right bottom, right bottom,
		right bottom;
}
</style>

</head>
<body>
        <button class="customBtn" onclick="window.location='createEmployee.jsp'">Create Employee</button>
	<hr>
	<br>
	<hr>
	<h4>Employee Created.</h4>
	<hr>
	
	
</body>
</html>