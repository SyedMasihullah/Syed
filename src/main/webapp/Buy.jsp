<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>Delete</title>
</head>
<body>
	<div>
		<form>
			<table>
				<tr>
					<td>Category</td>
					<td><input type="text" name="Category"></td>
				</tr>
				<tr>
					<td>Product ID</td>
					<td><input type="text" name="pid"></td>
					<td><small>(Required and must be Same)</small>
				</tr>
				<tr>
					<td>Product</td>
					<td><input type="text" name="pn"></td>
				</tr>
				<tr>
					<td>Brand</td>
					<td><input type="text" name="Br"></td>
				</tr>
				<tr>
					<td>Price</td>
					<td><input type="text" name="rs"></td>
				</tr>
								<tr>
					<td>Enter your gpay number for payment</td>
					<td><input type="text" name="rs"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" formaction="Buy"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>