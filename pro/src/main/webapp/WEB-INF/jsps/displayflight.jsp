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
<table border="1">
<tr>

<th>Operating Airlines</th>
<th>Departure City</th>
<th>Arrival City</th>
<th>Estimated Departure Time</th>
<th>Update</th>
</tr>
<c:forEach items="${findfligth}" var="findfligth" >
<tr>
<th>${findfligth.operatingAirlines}</th>
<th>${findfligth.departureCity}</th>
<th>${findfligth.arrivalCity}</th>
<th>${findfligth.estimateddeparturetime}</th>
<th><a href="showCompletReservation?fligthid=${findfligth.id}" >Select Flight</a></th>
</tr>
</c:forEach>
</table>
</body>
</html>