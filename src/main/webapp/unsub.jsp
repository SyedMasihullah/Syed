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

.Unsubscription {
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
		<h1>We are sorry to see you leave</h1>
	</center>
	<div class="Unsubscription" id="Unsubscription">
		<form>
			<Table>
				<tr>
					<td>Name</td>
					<td><input type="text" name="unname"></td>
				</tr>
				<tr>
					<td>Mobile</td>
					<td><input type="text" name="unmobile"></td>
					<td><small>(99999 00000)</small></td>
				</tr>
								<tr>
					<td>Password</td>
					<td><input type="password" name="unpass"></td>
					<td><small>(name@123)</small></td>
				</tr>
				<tr>
					<td><input type="submit" value="submit" formaction="unsub"></td>
					<td><input type="submit" value="Cancel" formaction="Login.jsp"></td>
				</tr>
			</Table>
		</form>
	</div>
</body>
</html>