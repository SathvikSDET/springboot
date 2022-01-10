<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Reservation</title>
</head>
<body>
<h2>Display Reservation</h2>
Passenger Detials:${findReservation.getPassenger().firstName}

<h2>Update Number of bags</h2>
<form action="save" method="post">
Number of bags:<input type="text" name="id" value="${findReservation.id}" readonly>
Number of bags:<input type="text" name="numberOfBags">
<input type="submit" value="Update">
</form>

</body>
</html>