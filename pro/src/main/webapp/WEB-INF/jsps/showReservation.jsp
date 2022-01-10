<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Details</title>
</head>
<body>
<h2>Flight Details</h2>
<pre>
Flight Number:${fligth.flightnumber}
Operating Airlines:${fligth.operatingAirlines}
Departure City:${fligth.departureCity}
Arrival City:${fligth.arrivalCity}
Date Of Departure:${fligth.dateofdeparture}
Flight number:${fligth.id}
</pre>
<h2>Enter Passenger Details</h2>
<form action="completreservation" method="post">
<pre>
First Name:<input type="text" name="firstname"/>
Last Name:<input type="text" name="lastname"/>
Middle Name:<input type="text" name="middlename"/>
Email Id:<input type="text" name="email"/>
phone number:<input type="text" name="phone"/>
<input type="hidden" name="id" value="${fligth.id}" />

<input type="submit" value="COMPLET RESERVATION"/>
</form>

</pre>
</body>
</html>