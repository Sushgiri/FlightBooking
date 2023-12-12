<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
<form action="updaterecord" method="post">
<pre>
<input type="hidden" name="id" value="${record.id }" >
From:          <input type="text"  name="originating" value="${record.originating}"><br>
Destination:   <input type="text" name="destination" value="${record.destination}"><br>
Arrival:      <input type="text" name="arravial" value="${record.arrvial}"><br>
Departure:     <input type="text" name="departure" value="${record.departure}"><br>
Duration:      <input type="text" name="flightDuration" value="${record.flightDuration}"><br>
Price:         <input type="text" name="price" value="${record.price}"><br>
Seats:         <input type="text" name="seats" value="${record.seats}"><br>
      <input type="submit" value="Save">
      </pre>
      </form>
</body>
</html>