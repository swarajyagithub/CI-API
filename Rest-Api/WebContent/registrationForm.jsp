<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>

<body>
<h1>Registeration Form</h1>
<form action="welcome.html" method="post" >

     
			<table style="with: 50%">
				<tr>
					<td> Name</td>
					<td><input type="text" name="username" placeholder="Username" pattern="[A-Za-z]{1,20}" 
					title="Name is invalid. Name should contains only alphabets.">
					</td>
					
				</tr>
				<tr>
					<td> Country</td>
					<td><input type="text" name="country" placeholder="Country Name" pattern="[A-Za-z]{1,20}" 
					title="Name is invalid. Name should contains only alphabets.">
					</td>
					
				</tr>
				
				<tr>
				<td> Phone Number</td>
					<td><input type="text" name="PhoneNumber"
					 placeholder="Enter phone number" 
					pattern="[0-9]{10}"
					title="Phone number is invalid. Phone number should contains only numbers. Phone number must be 10 digits."/>
					</td>
				</tr>
				<tr>
				   <td>Email</td>
				    <td><input type="email" name="email" 
				    placeholder="Enter email address." 
                    pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"
					title="Email is invalid. Email address must be in valid format. For example: abc26@gmail.com"/></td>
				</tr>
				<tr>
				   <td>Password</td>
				    <td><input type="password" name="pass" id="password1"
				    placeholder="Enter password" 
                    pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
					title="Password is invalid. It contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"/></td>
				</tr>
				<tr>
				   <td>Confirm Password</td>
				    <td><input type="password" name="passCon" id="password2"
				    placeholder="Confirm password" 
                   
					/></td>
				</tr>
				
			
				
					

					</table>
			<input type="submit" value="Submit" /></form>
			
			<script type="text/javascript">
window.onload = function () {
	document.getElementById("password1").onchange = validatePassword;
	document.getElementById("password2").onchange = validatePassword;
}
function validatePassword(){
var pass2=document.getElementById("password2").value;
var pass1=document.getElementById("password1").value;
if(pass1!=pass2)
	document.getElementById("password2").setCustomValidity("Passwords Don't Match");
else
	document.getElementById("password2").setCustomValidity('');	 

}
</script>
			
</body>
</html>

