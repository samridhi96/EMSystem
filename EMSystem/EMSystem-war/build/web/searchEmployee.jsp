<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="shortcut icon" type="image/x-icon" href="favicon.ico" />
<title>Search Employee</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

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

input[type=number], input[type=text] {
	padding: 12px 20px;
	margin: 8px 0;
	box-sizing: border-box;
	border: none;
	border-bottom: black;
	-webkit-transition: 0.5s;
	transition: 0.5s;
	outline: none;
	margin-left: auto;
	margin-right: auto;
}

input[type=number]:focus, input[type=text]:focus {
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
	margin-left: 270%;
	width: 70%;
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

/*the container must be positioned relative:*/
.autocomplete {
	position: absolute;
	display: inline-block;
	text-align: center;
	margin-left: 41.5%;
	margin-top: -3.95%;
}

.autocomplete-items {
	position: absolute;
	border: 1px solid #d4d4d4;
	border-bottom: none;
	border-top: none;
	z-index: 99;
	top: 88.4%;
	left: 0;
	right: 0;
	overflow: auto;
	max-height: 195px;
}

.autocomplete-items div {
	padding: 10px;
	cursor: pointer;
	background-color: #fff;
	border-bottom: 1px solid #d4d4d4;
}

/*when hovering an item:*/
.autocomplete-items div:hover {
	background-color: #e9e9e9;
}

/*when navigating through the items using the arrow keys:*/
.autocomplete-active {
	background-color: DodgerBlue !important;
	color: #ffffff;
}
</style>

</head>
<body>
	<hr>
	<h1>Search Employee</h1>
	<hr>
	<button class="customBtn" onclick="window.location='home.jsp'">
		Home</button>
	<hr>
	<br>
	<form name="searchEmpForm" action="SearchServlet" method="post"
		autocomplete="off">
		<fieldset>
			<legend class="legend">Employee Search Engine</legend>
			<br>

			<table class="center">
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr>
					<th><input type="radio" id="sEmp" name="sR" value="1"
						 checked> Search by
						Employee Id</th>

					
				</tr>
				<tr>
					<th></th>
				</tr>
				<tr>
					<th></th>
				</tr>
				<tr>
					<th></th>
				</tr>
				<tr>
					<th></th>
				</tr>
				<tr>
					<th></th>
				</tr>
				<tr>
					<th><input type="submit" value="Search" /></th>
				</tr>
				
			</table>
			<div class="autocomplete" style="width: 250px;">
				<input id="searchInput" type="text" name="employeeId"
					style="width: 250px; text-align: center;" required>
			</div>
		</fieldset>
	</form>
	

</body>
</html>
