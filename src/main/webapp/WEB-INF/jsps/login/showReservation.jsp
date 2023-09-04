

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>

</head>
<body>
 
	  <h2>Flight Details</h2>
	
	  Flight Number: ${flight.flightNumber}<br>
	  Operating Airlines: ${flight.operatingAirlines}<br>
	  Departure City: ${flight.departureCity }<br>
	  Arrival City: ${flight.arrivalCity }<br>
	  Departure Date: ${flight.dateOfDeparture}<br>
	  <h2>Enter Passenger Details</h2>
	  
	  <form action="confirmReservation" method="post"> 
	  <pre>
	<b>  ENTER YOUR DETAILS</b>
	  First Name: <input type="text" name="firstName"/>
	  Last Name: <input type="text" name="lastName"/>
	  Middle Name: <input type="text" name="middleName"/>
	  Email: <input type="text" name="email"/>
	  phone: <input type="text" name="phone"/>
	
	 <input type="hidden" name="flightId" value="${flight.flightId}"/> 
	 <input type="hidden" name="flightNumber" value="${flight.flightNumber}"/>
	 <input type="hidden" name="operatingAirlines" value="${flight.operatingAirlines}"/>
	  <input type="hidden" name="departureCity" value="${flight.departureCity}"/>
	  <input type="hidden" name="arrivalCity" value="${flight.arrivalCity }"/>
	  <input type="hidden" name="departureDate" value="${flight.dateOfDeparture}"/>
	   <b>PAYMENT DETAILS</b>
	  Name On The Card<input type="text" name="NameOnTheCard"/>
	  Card Number: <input type="text" name="cardNumber"/>
	  CVV: <input type="text" name="cvv"/>
	  Expiry Date: <input type="text" name="expiryDate"/>
	  
	  <input type="submit" name="Complete Reservation"/>
	   
	 </pre>
	 </form>
</body>
</html>