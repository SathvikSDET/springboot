<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation</title>
</head>
<body>
	<h2>Flight Details</h2>
	Flight Number: ${flights.flightNumber} <br/>
	Operating Airlines: ${flights.operatingAirlines} <br/>
	Departure City: ${flights.departureCity} <br/>
	Arrival City: ${flights.arrivalCity} <br/>
	Date Of Departure: ${flights.dateOfDeparture} <br/>
	Estimated DepartureTime: ${flights.estimatedDepartureTime} <br/>
	
	<h2>Passenger Details</h2>
	<form action="confirmRegistration" method="post">
	<pre>
		First Name<input type="text" name="firstName"/>
		last Name<input type="text" name="lastName"/>
		Middle Name<input type="text" name="middleName"/>
		Email<input type="text" name="email"/>
		Phone<input type="text" name="phone"/>
		<input type="hidden" name="id" value="${flights.id}"/>
	<h2>Enter the card details</h2>
		Card Number<input type="text" /><br/>
		CVV<input type="text"/><br/>
		Expiry Date<input type="text" /><br/>
		Amount<input type="text"/><br/>
		<input type="Submit" value="proceed"/>
	</pre>
	</form>
</body>
</html>