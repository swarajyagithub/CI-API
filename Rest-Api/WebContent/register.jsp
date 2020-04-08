<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>

<body>
<h1>Register Form</h1>
<form action="api/db/register" method="post" >
<div class="container">
			<table style="with: 50%">
				<tr>
					<td> Name</td>
					<td><input type="text" name="Name" 
					placeholder="Enter your name"
					pattern="[A-Za-z]"  
					title="Name is invalid. Name should contains only alphabets"/>
					</td>
					
				</tr>
				<tr>
					<td>Phone Number</td>
					<td><input type="number" name="PhoneNumber"
					 placeholder="Enter phone number" 
					pattern="{0-9}"
					title="Phone number is invalid. Phone number should contains only numbers"/>
					</td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="Email"
					placeholder="Enter your email"
					pattern="/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/"
					title="Email is invalid."/></td>
				</tr>
					<tr>
					<td>Country</td>
					<td><input type="text" name="Country" 
					placeholder="Enter name of country"
					pattern="[A-Za-z]"
					title="Country is invalid. It should contains only alphabets"/>
					
					</td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="Password" 
					placeholder="Enter password"
					pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3},$"
					title="Password is invalid. It should contain at least one capital letter, one number and one special character. It should be mininmum of 8 character in lenghth."
					/></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><input type="password" name="ConfirmPass" /></td>
				</tr></table>
			<input type="submit" value="Submit" /></form>
			</div>
			</form>
</body>
</html>

