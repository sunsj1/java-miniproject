<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Faculty Registration</title>
</head>
<body bgcolor="purple">
	<form action="register">
		<h1>
			<center>
				<font color="white">Register Page</font>
			</center>
		</h1>
		<table align="center">
			<tr>
				<td><h4>
				<font color="yellow">Name :-</font></td>
				<td><input type="text" name="name" placeholder="eg. Your name or company">
				</h4></td>
			</tr>
			<tr>
				<td><h4><font color="yellow">Contact Number :-</font></td>
				<td><input type="text" name="mobile" placeholder="eg. 967*****66"></td>
			</tr>
			<tr>
				<td><h4><font color="yellow">Email :-</font></td>
				<td><input type="text" name="email" id="email" placeholder="test@example.com" onkeyup="checkMailStatus(1)"></td>
			</tr>
				<tr>
				<td><font color="yellow">Gender :-</font></td>
				<td><font color="Yellow"> <input type="radio"
						name="gender" value="male">Male <input type="radio"
						name="gender" value="female">Female <input type="radio"
						name="gender" value="other">Other</td>
				</font>
			</tr>			
				<tr>
				<td><font color="yellow">Role :-</font></td><td><input readonly="readonly" type="text" name="role" value="Assistance Proffessor" placeholder="rolename" class="form-control inputdefault">
			</td></tr>
			<tr>
				<td><font color="Yellow">Subject You Teach:-</font></td>
				<td><font color="yellow">Sub1</font><input type="checkbox"
					name="sub1" value="SUB1"> <font color="yellow">Sub2</font><input
					type="checkbox" name="sub2" value="SUB2"><br> <font
					color="yellow">Sub3</font><input type="checkbox" name="sub3"
					value="SUB3"> <font color="yellow">Sub4</font><input
					type="checkbox" name="sub4" value="SUB4"> <br>
				<font color="yellow">Sub5<input type="checkbox"
						name="sub5" value="SUB5"> <font color="yellow">Sub6</font><input
						type="checkbox" name="sub6" value="SUB6"><br>
			</tr>
			
			<tr>
				<td><h4><font color="yellow">Country :-</font></td><td><select name="country">
						<option value="India">India</option>
				</select></td>
			</tr>
			<tr>
				<td><h4><font color="yellow">State :-</font></td>
				<td><select name="state">
						<option value="Maharashtra">Maharashtra</option>
						<option value="Kerala">Kerala</option>
						<option value="Gujrat">Gujrat</option>
						<option value="Bihar">Bihar</option>
						<option value="Punjab">Punjab</option>
				</select></td>
			</tr>
			
			<tr>
				<td><h4><font color="yellow">City :-</font></td>
						<td><select name="city">
								<option value="Pune">Pune</option>
								<option value="Ahmednagar">Ahmednagar</option>
								<option value="Mumbai">Mumbai</option>
								<option value="Nashik">Nashik</option>
								<option value="Sangamner">Sangamner</option>
								<option value="Yawatmal">Yawatmal</option>
								<option value="Satara">Satara</option>
						</select></td>
			</tr>
			<tr>
			<td><h4><font color="yellow">College Name :-</h4></font></td><td> <input readonly="readonly" value="Jspm's ICOE, Pune"
					name="collegeName"  placeholder="Enter Pincode">
					</td></tr>
			<tr><td><h4><font color="yellow">Password :-</h4></td><td> <input type="password"name="password" placeholder="Type a password" id="password1">
			</td></tr>
			<tr><td><h4><font color="yellow">Confirm Password :-</h4></td><td> <input
					type="password" id="confirmpassword1"placeholder="Type a password again" onkeyup="check(2)"> <span
					id='message'></span></td></tr>
			<tr>
				<td><input type="submit" value="Register"></a></td>
			</tr></table>
			</form></body>
</html>