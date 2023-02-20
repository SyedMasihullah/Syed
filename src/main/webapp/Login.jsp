<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	background-color: #90EE90;
	margin: device;
	align: auto;
}

table {
	background-color: #90EE90;
	color: white;
	margin: device;
	padding: 15px;
	align: auto;
}

.admin, .users {
	background-color: #90EE90;
	color: white;
	border: 2px solid white;
	margin: device;
	padding: 15px;
	align: auto;
}
</style>
<meta name="viewport" content="width=device-width,initial-scale=1.0"
	charset="UTF-8">
<meta name="description" content="products for best price">
<meta name="keywords" content="mobile,laptop,Software"
	http-equiv="refresh" content="15">
<meta name="author" content="Syed Masihullah">
<title>Login with tajir</title>
</head>
<body>
	<center>
		<h1>Welcome</h1>
	</center>
	<div class="users" id="users">
		<form>
			<Table>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="userpass"></td>
				</tr>
				<tr>
					<td colspan="2"><input Type="submit" value="login"
						formaction="Logindata"> <input Type="submit"
						value="sign up" formaction="signup.jsp"> <input
						Type="submit" value="Unsubscribe" formaction="unsub.jsp"></td>
				</tr>
			</Table>
		</form>
	</div>
	<hr>
	Over here!! dear Admin
	<div class="admin" id="admin">
		<form>
			<table>
				<tr>
					<td>Admin ID</td>
					<td><input type="number" name="adminid"><small>1234</small></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="adminpass"><small>name@123</small></td>
				</tr>
				<tr>
					<td><input type="submit" value="logon"
						formaction="adminscorner.jsp"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>