<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%
String name = (String) session.getAttribute("un");
if (name != null) {
	response.getWriter().print("hello " + name);
} else {
	response.sendRedirect("Login.jsp");

}
%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width,initial-scale=1.0"
	charset="UTF-8">
<meta name="description" content="products for best price">
<meta name="keywords" content="mobile,laptop,Software"
	http-equiv="refresh" content="15">
<meta name="author" content="Syed Masihullah">
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
.Mob, .Lap, .Soft {
	background-color: #90EE90;
	color: white;
	border: 2px solid white;
	margin: device;
	padding: 10px;
	align: cent;
}
</style>
<title>Admins-Tajir</title>
</head>
<body>
	<form>
		<div class="Mob" id="Mob">
			<table>
				<tr>
					<td rowspan="4"><img class="Mobiles Section"
						src="assets/Img/mobile.jfif" style="width: 360px; height: 180px;"></td>
					<td><button type=submit formaction="Read.jsp">Details</button></td>
				</tr>
				<tr>
					<td><button type=submit formaction="admob">Buy</button></td>
				</tr>
			</table>
		</div>
		<div class="Lap" id="Lap">
			<table>
				<tr>
					<td rowspan="4"><img class="Laptop Section"
						src="assets/Img/Laptop.jfif" style="width: 360px; height: 180px;"></td>
					<td><button type=submit formaction="Read.jsp">Details</button></td>
				</tr>
				<tr>
					<td><button type=submit formaction="Buy.jsp">Buy</button></td>
				</tr>
			</table>
		</div>
		<div class="Soft" id="Soft">
			<table>
				<tr>
					<td rowspan="4"><img class="Software Section"
						src="assets/Img/Software.jfif"
						style="width: 360px; height: 180px;"></td>
					<td><button type=submit formaction="Read.jsp">Details</button>
				</tr>
				<tr>
					<td><button type=submit formaction="admob">Buy</button></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>