<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Information</title>
<script type="text/javascript">
function studentInfo() {
	document.myform.action="studentInfo";
	document.myform.submit();
}
function facultyInformation() {
	document.myform.action="facultyInfo";
	document.myform.submit();
}
</script>
</head>
<body bgcolor="purple">
<form name="myform">
<h3>${msg}</h3>
	<center>
		<input type="submit" value="Student Information" onclick="studentInfo()">
		 <input type="submit"value="Faculty Information" onclick="facultyInformation()">
	</center>
	</form>
</body>
</html>