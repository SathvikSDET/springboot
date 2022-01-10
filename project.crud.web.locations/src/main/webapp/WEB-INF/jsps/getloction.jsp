<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %> 
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<style>
table {
  border-collapse: collapse;
  border-spacing: 0;
  width: 100%;
  border: 1px solid #ddd;
}

th, td {
  text-align: left;
  padding: 16px;
}

tr:nth-child(even) {
  background-color: #f2f2f2;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>All Location</h2>
<table border="1">
<tr>
<th>Id</th>
<th>Code</th>
<th>Name</th>
<th>Type</th>
<th>delet</th>
<th>update</th>
</tr>
<c:forEach items="${location}" var="location" >
<tr>
<th>${location.id}</th>
<th>${location.code}</th>
<th>${location.name}</th>
<th>${location.type}</th>
<th><a href="deletlocation?id=${location.id}">delete</a></th>
<th><a href="updatethelocation?id=${location.id}">update</a></th>
</tr>
</c:forEach>


</table>

</body>
</html>