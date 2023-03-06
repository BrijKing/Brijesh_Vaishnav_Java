<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="display:flex;justify-content: center">
		<form method="get" action="/adddata" name="form">
			Name: <input type="text" name="uname"><br>
			<br> Email: <input type="email" name="email"><br>
			<br> Password: <input type="password" name="pass"><br>
			<br> Address: <input type="text" name="address"><br>
			<br> Mobile: <input type="text" name="mobile"><br>
			<br> date: <input type="date" name="date"><br>
			<br> <input type="submit" value="submit to register your info"><br>
		</form>
	</div>


</body>
</html>