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

.Registration {
	background-color: #90EE90;
	color: white;
	border: 2px solid white;
	margin: device;
	padding: 20px;
	align: auto;
}
</style>
<meta name="viewport" content="width=device-width,initial-scale=1.0"
	charset="UTF-8">
<meta name="description" content="products for best price">
<meta name="keywords" content="mobile,laptop,Software"
	http-equiv="refresh" content="15">
<meta name="author" content="Syed Masihullah">
<title>Registration form</title>
</head>
<body>
	<center>
		<h1>Lets Get Started</h1>
	</center>
	<div class="Registration" id="Registration">
		<form>
			<Table>
				<tr>
					<td>Name</td>
					<td><input type="text" name="regname" maxlength="25 charecter"></td>
					<td><small>(max 25 chars only)</small></td>
				</tr>
				<tr>
					<td>Mail</td>
					<td><input type="text" name="regmail"></td>
					<td><small>(name@example.com)</small></td>
				</tr>
				<tr>
					<td>Mobile</td>
					<td><input type="text" name="regmobile"></td>
					<td><small>(99999 00000)</small></td>
				</tr>
								<tr>
					<td>Password</td>
					<td><input type="password" name="regpass"></td>
					<td><small>(name@123)</small></td>
				</tr>
				<tr>
					<td><input type="submit" value="submit" formaction="signupdata"></td>
					<td><input type="submit" value="Cancel" formaction="Login.jsp"></td>
				</tr>
			</Table>
		</form>
	</div>
</body>
</html>