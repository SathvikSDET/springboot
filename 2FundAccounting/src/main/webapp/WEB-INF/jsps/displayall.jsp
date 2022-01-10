<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
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
<body>
<h2>All Location</h2>
<table border="1">
<tr>
<th>Firstname</th>
<th>Middlenames</th>
<th>Lastname</th>
<th>Phonenumber</th>
<th>delet</th>
<th>update</th>
</tr>

<tr>
<th>${findByFirstname.getFirstname()}</th>
<th>${findByFirstname.getMiddlenames()}</th>
<th>${findByFirstname.getLastname()}</th>
<th>${findByFirstname.getPhonenumber()}</th>
<th><a href="deletlocation?id=${findByFirstname.getId()}">delete</a></th>
<th><a href="updatethelocation?id=${findByFirstname.getId()}">update</a></th>
</tr>



</table>

</body>
</body>
</html>