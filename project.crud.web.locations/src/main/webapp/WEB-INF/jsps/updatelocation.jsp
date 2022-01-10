<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
<h2>Update</h2>
 <form action="updateLoc" method="post">
id<input type="text" name="id" value="${id}" readonly>
code<input type="text" name="code" value="${code}">
name<input type="text" name="name" value="${name}">
type:urban<input type="radio" name="type" value="${type}">
rural:<input type="radio" name="type" value="${type}">
<input type="submit"  value="update">
</form>
${updatemsg}
</body>
</html>