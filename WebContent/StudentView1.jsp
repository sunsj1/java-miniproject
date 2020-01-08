<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	function update() {
		document.myform.action = "UpdateServlet11";
		document.myform.submit();
	}
	function Attendence() {
		document.myform.action = "Attendence";
		document.myform.submit();
	}
</script>
<title>Student Information</title>
</head>
<body bgcolor="silver">


	${msg}
	<table align="center" border="2">
		<form name="myform">
			<tr>
				<th></th>
				<th>Name</th>
				<th>Contoct No</th>
				<th>Email</th>
				<th>Gender</th>
				<th>SUB1</th>
				<th>Mark</th>
				<th>SUB2</th>
				<th>Mark</th>
				<th>SUB3</th>
				<th>Mark</th>
				<th>SUB4</th>
				<th>Mark</th>
				<th>SUB5</th>
				<th>Mark</th>
				<th>SUB6</th>
				<th>Mark</th>
				<th>Out Off</th>
     			<th>Role</th>
			</tr>
			<tr>
				<c:forEach items="${data}" var="u">
					<td><input type="radio" name="id" value="${u.id}"></td>
					<td>${u.name}</td>
					<td>${u.mobile}</td>
					<td>${u.email}</td>
					<td>${u.gender}</td>
					<td>${u.sub1}</td>
					<td>${u.sub1mark}</td>
					<td>${u.sub2}</td>
					<td>${u.sub2mark}</td>
					<td>${u.sub3}</td>
					<td>${u.sub3mark}</td>
					<td>${u.sub4}</td>
					<td>${u.sub4mark}</td>
					<td>${u.sub5}</td>
					<td>${u.sub5mark}</td>
					<td>${u.sub6}</td>
					<td>${u.sub6mark}</td>
					<td>${u.outoff}</td>
					<td>${u.role}</td>	</tr>
			</c:forEach>
	</table>
	<br>
	<center>
		<input type="submit" value="Update" onclick="update()"> <input
			type="submit" value="Attendence" onclick="Attendence()">

		</form>
</body>
</html>