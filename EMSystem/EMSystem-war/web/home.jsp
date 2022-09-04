<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" type="image/x-icon" href="favicon.ico" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<title>Admin Home</title>
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

.logoutBtn {
	border: black;
	font-size: 20px;
	padding: 5px 22px;
	color: black;
	border-radius: 8px;
	cursor: pointer;
	margin-left: 86.7%;
	width: 13%;
}

.logoutBtn:hover {
	border: black;
	font-size: 20px;
	padding: 5px 22px;
	color: black;
	background-color: lightcoral;
	border-radius: 8px;
	cursor: pointer;
}

.customBtn {
	border: black;
	font-size: 20px;
	padding: 5px 22px;
	color: black;
	background-color: white;
	border-radius: 8px;
	cursor: pointer;
}

.customBtn:hover {
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

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f1f1f1;
	min-width: 200px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
	overflow: auto;
	max-height: 200px;
}

.dropdown-content a {
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
}

.dropdown a:hover {
	background-color: #e9e9e9;
}

.show {
	display: block;
}
</style>

</head>
<body onload="checkFlag()">
	<hr>
	<h1>HR Dashboard</h1>
	<hr>
	<button class="logoutBtn" onclick="window.location='Login.jsp'">Logout</button>
	<hr>
	<br>
	<fieldset>
		<legend class="legend">EMS Menu</legend>
		<table class="center">
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
				<th></th>
			</tr>
			<tr>
				<th></th>
			</tr>
			<tr>
				<th></th>
			</tr>
			<tr>
				<th><button class="customBtn"
						onclick="window.location.href='createEmployee.jsp'">Create
						Employee</button> <br></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th><button class="customBtn"
						onclick="window.location.href='searchEmployee.jsp' ">Search
						Employee</button> <br></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>

				<th><button class="customBtn"
						onclick="window.location.href='updateEmployee.jsp' ">Update
						Employee</button> <br></th>

				<th></th>
				<th></th>
				<th><button class="customBtn"
						onclick="window.location.href='deleteEmployee.jsp' ">Delete
						Employee</button> <br>
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
		</table>
	</fieldset>
	
</body>
</html>