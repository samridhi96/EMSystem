<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="shortcut icon" type="image/x-icon" href="favicon.ico" />
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<style>
body {
	background: lavenderblush;
}

h1 {
	text-align: center;
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

table.dbTable, td.dbTable, th.dbTable {
	margin-left: auto;
	margin-right: auto;
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
	padding: 5px;
}

table.dbTable tr:nth-child(even) {
	background-color: #aaa;
}

table.dbTable {
	background-color: black;
	color: white;
}
</style>
</head>
<body>
	<hr>
	<h1>
		Employee Details
	</h1>
	<hr>
	<button class="customBtn" onclick="window.location='searchEmployee.jsp'">Search</button>
	<hr>
	<br>
	<div class="table-responsive">
		<table
			class="table table-dark table-striped table-bordered table-hover">
			<tr>
				
				<th>Employee Id</th>
                                <th>Name</th>
                                <th>eMail</th>
				<th>DOB</th>
				<th>Gender</th>
				<th>Home Address</th>
                                <th>Phone No</th>
                                <th>Department</th>
				<th>Salary</th>
				<th>Job Title</th>
				<th>Status</th>
			</tr>
			
			<tr>
				<td>${viewEmployee.eid}</td>
                                <td>${viewEmployee.name}</td><!-- comment -->
                                <td>${viewEmployee.email}</td><!-- comment -->
                                <td>${viewEmployee.dob}</td>
				<td>${viewEmployee.gender}</td>
                                <td>${viewEmployee.homeAddress}</td>
                                <td>${viewEmployee.phoneNo}</td>
                                <td>${viewEmployee.department}</td>
                                <td>${viewEmployee.salary}</td>
                                <td>${viewEmployee.designation}</td>
                                <td>${viewEmployee.status}</td>
			</tr>
			
		</table>
	</div>
</body>
</html>