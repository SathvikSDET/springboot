<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show registration</title>
</head>
<body>
<h2>create new registration</h2>
<form action="showRegsave" method="post">
	<pre>
	FIRSTNAME:<input type="text" name="firstName"/><br>
	LASTNAME:<input type="text" name="lastName"/><br>
	EMAILID:<input type="text" name="emailid"/><br>
	PASSWORD:<input type="password" name="password"/><br>
	<input type="submit" value="login"/>
	</pre>
	</form>
	${msg}

</body>
</html>