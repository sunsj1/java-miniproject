<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<body bgcolor="silver">
	<form action="login">
		<h1>
			<center>
				<font color="Red">Login Here</font>
		</h1>
		<h3>
			${msg}
			<table align="center">
				<tr>
					<td>Email:-</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>Password:-</td>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
			<center>
				<input type="submit" value="Login"> <a href="R.jsp"><input
					type="button" value="Sign up"></a>
			</center>
	</form>
</body>


</html>