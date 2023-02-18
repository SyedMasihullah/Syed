<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
table,td{background-color: #90EE90;
	color: white;
	margin: device;
	padding: 15px;
	align: auto;}
.admin,.users{
	background-color: #90EE90;
	color: white;
	border: 2px solid white;
	margin: device;
	padding: 15px;
	align: auto;
}
</style>
<meta name="viewport" content ="width=device-width,initial-scale=1.0" charset="UTF-8">
<meta name="description" content="products for best price">
<meta name="keywords" content="mobile,laptop,Software" http-equiv="refresh" content="15">
<meta name="author" content="Syed Masihullah">
<title>Login with tajir</title>
</head>
<body>
<h1>Welcome</h1>
	<div class="users" id="users">
		<Table>
			<tr>
				<td>User Name</td>
				<td><input type="Text" name="username">(max 25 chars only)</td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="Password" name="userpassword">(name@123)</td>
			</tr>
			<tr>
				<td><input Type="button" formaction="index.jsp" value="login"></td>
				<td><input Type="button" formaction="signup.jsp"
					value="sign up"></td>
			</tr>
		</Table>
	</div>
	Over here!! dear Admin
	<div class="admin" id="admin">
		<table>
			<tr>
				<td>Admin ID</td>
				<td><input type="number" name="aid">1234</td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="adminpass">name@123</td>
			</tr>
			<tr>
				<td><input type="button" formaction="adminscorner.jsp"
					value="logon"></td>
			</tr>
		</table>
	</div>
</body>
</html>