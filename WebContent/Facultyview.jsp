<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function add() {
document.myform.action="R.jsp";
document.myform.submit();
}
function update() {
document.myform.action="UpdateServlet";
document.myform.submit();
}
function del() {
	document.myform.action="DeleteServlet";
	document.myform.submit();
}
</script>
<title>Faculty Information</title>
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
<th>SUB2</th>
<th>SUB3</th>
<th>SUB4</th>
<th>SUB5</th>
<th>SUB6</th>
<th>Role</th>
</tr>
<tr>
<c:forEach items="${data}" var="u">
<td><input type ="radio"  name="id" value="${u.id}"></td>
<td>${u.name}</td>
<td>${u.mobile}</td>
<td>${u.email}</td>
<td>${u.gender}</td>
<td>${u.sub1}</td>
<td>${u.sub2}</td>
<td>${u.sub3}</td>
<td>${u.sub4}</td>
<td>${u.sub5}</td>
<td>${u.sub6}</td>
<td>${u.role}</td>
</tr>
</c:forEach>
</table>
<br>
<center><input type="submit" value="Add" onclick="add()">
<input type="submit" value="Update" onclick="update()">
<input type="submit" value="Delete" onclick="del()"></center>
</form>
</body>
</html>