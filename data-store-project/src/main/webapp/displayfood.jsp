<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<a href="cartproducts.jsp" style="float: right"><input type="submit" value="Cart"></a>

		<table border="2px solid black;border-collapse:collapse;">
		<tr>
			<th>Id</th>
			<th>Food Name</th>
			<th>Price</th>
			<th>Choose</th>
		</tr>
		<tr>
			<td>101</td>
			<td>DilPasand</td>
			<td>20.00</td>
			<td><a href="addurl?fooditem=DilPasand"><input type="submit" value="ADD"></a></td>
		</tr>
		<tr>
			<td>102</td>
			<td>Samose</td>
			<td>15.00</td>
			<td><a href="addurl?fooditem=Samose"><input type="submit" value="ADD"></a></td>
		</tr>
		<tr>
			<td>103</td>
			<td>Kachori</td>
			<td>15.00</td>
			<td><a href="addurl?fooditem=Kachori"><input type="submit" value="ADD"></a></td>
		</tr>
		<tr>
			<td>104</td>
			<td>Jilebi</td>
			<td>20.00</td>
			<td><a href="addurl?fooditem=Jilebi"><input type="submit" value="ADD"></a></td>
		</tr>
		<tr>
			<td>105</td>
			<td>Malpuri</td>
			<td>20.00</td>
			<td><a href="addurl?fooditem=Malpuri"><input type="submit" value="ADD"></a></td>
		</tr>
		
		</table>
</body>
</html>