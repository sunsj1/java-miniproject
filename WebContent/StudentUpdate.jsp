<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body bgcolor="purple">
	<form action="save">
		<h1>
			<center>
				<font color="white">Update Information</font>
			</center>
		</h1>
		<table align="center">
			<input type="hidden" name="id" value="${data.id}">
			<tr>
				<td><h4>
						<font color="yellow">Name :-</font></td>
				<td><input type="text" name="name"
					placeholder="eg. Your name or company" value="${data.name}">
					</h4></td>
			</tr>
			<tr>
				<td><h4>
						<font color="yellow">Contact Number :-</font></td>
				<td><input type="text" name="mobile"
					placeholder="eg. 967*****66" value="${data.mobile}"></td>
			</tr>
			<tr>
				<td><h4>
						<font color="yellow">Email :-</font></td>
				<td><input type="text" name="email" id="email"
					placeholder="test@example.com" value="${data.email}"
					onkeyup="checkMailStatus(1)"></td>
			</tr>
			<tr>
				<td><font color="yellow">Gender :-</font></td>
				<td><font color="Yellow">
	<input type="radio" name="gender" value="male" <c:if test="${data.gender=='male'}">checked="checked"</c:if>>Male
	<input type="radio" name="gender" value="female"<c:if test="${data.gender=='female'}">checked="checked"</c:if>>Female 
	<input type="radio" name="gender" value="other" <c:if test="${data.gender=='other'}">checked="checked"</c:if>>Other</td>
	</font></tr>
			<tr>
				<td><font color="yellow">Role :-</font></td>
				<td><input readonly="readonly" type="text" name="role"
					value="${data.role}" placeholder="rolename"
					class="form-control inputdefault"></td>
			</tr>
			<tr>
				<td><font color="Yellow">Subject :-</font></td>
				<td><font color="yellow">Sub1</font><input type="checkbox"
					name="sub1" value="SUB1"<c:if test="${data.sub1=='SUB1'}">checked="checked"</c:if>> <font color="yellow">Sub2</font><input
					type="checkbox" name="sub2" value="SUB2"<c:if test="${data.sub2=='SUB2'}">checked="checked"</c:if>><br> <font
					color="yellow">Sub3</font><input type="checkbox" name="sub3"
					value="SUB3"<c:if test="${data.sub3=='SUB3'}">checked="checked"</c:if>> <font color="yellow">Sub4</font><input
					type="checkbox" name="sub4"value="SUB4"<c:if test="${data.sub4=='SUB4'}">checked="checked"</c:if>> <br> <font
					color="yellow">Sub5<input type="checkbox" name="sub5"
						value="SUB5"<c:if test="${data.sub5=='SUB5'}">checked="checked"</c:if>> <font color="yellow">Sub6</font><input
						type="checkbox" name="sub6" value="SUB6"<c:if test="${data.sub6=='SUB6'}">checked="checked"</c:if>><br>
			</tr>
			<tr>
				<td><h4>
						<font color="yellow">Country :-</font></td>
				<td><select name="country">
						<option value="India"
							<c:if test="${data.country=='India'}">selected="selected"</c:if>>India</option>
				</select></td>
			</tr>
			<tr>
				<td><h4>
						<font color="yellow">State :-</font></td>
				<td><select name="state">
						<option value="Maharashtra"
							<c:if test="${data.state=='Maharashtra'}">selected="selected"</c:if>>Maharashtra</option>
						<option value="Kerala"
							<c:if test="${data.state=='Kerala'}">selected="selected"</c:if>>Kerala</option>
						<option value="Gujrat"
							<c:if test="${data.state=='Gujrat'}">selected="selected"</c:if>>Gujrat</option>
						<option value="Bihar"
							<c:if test="${data.state=='Bihar'}">selected="selected"</c:if>>Bihar</option>
						<option value="Punjab"
							<c:if test="${data.state=='Punjab'}">selected="selected"</c:if>>Punjab</option>
				</select></td>
			</tr>

			<tr>
				<td><h4>
						<font color="yellow">City :-</font></td>
				<td><select name="city"><option value="Pune"
							<c:if test="${data.city=='Pune'}">selected="selected"</c:if>>Pune</option>
						<option value="Ahmednagar"
							<c:if test="${data.city=='Ahmednagar'}">selected="selected"</c:if>>Ahmednagar</option>
						<option value="Mumbai"
							<c:if test="${data.city=='Mumbai'}">selected="selected"</c:if>>Mumbai</option>
						<option value="Nashik"
							<c:if test="${data.city=='Nashik'}">selected="selected"</c:if>>Nashik</option>
						<option value="Sangamner"
							<c:if test="${data.city=='Sangamner'}">selected="selected"</c:if>>Sangamner</option>
						<option value="Yawatmal"
							<c:if test="${data.city=='Yawatmal'}">selected="selected"</c:if>>Yawatmal</option>
						<option value="Satara"
							<c:if test="${data.city=='Satara'}">selected="selected"</c:if>>Satara</option>

				</select></td>
			</tr>
			<tr>
				<td><h4>
						<font color="yellow">College Name :- 
					</h4> </font></td>
				<td><input readonly="readonly" value="Jspm's ICOE, Pune"
					name="collegeName" placeholder="Enter Pincode"></td>
			</tr>
			<tr>
			<td><h4>
						<font color="yellow">Password :- 
					</h4> </font></td>
				<td><input type="text" name="password"
					placeholder="Type a password" id="password1" value="${data.password}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="update"></a></td>
			</tr>
		</table>
	</form>
</body>
</html>