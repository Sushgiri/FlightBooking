<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
</head>
<body>
<h2>Admin</h2>
<form action="SaveRecord" method="post">
<pre>
<input type="hidden" name="id" >

From:          <input type="text"  name="originating"><br>
Destination:   <input type="text" name="destination"><br>
Arravial:      <input type="text" name="arravial"><br>
Daparture:     <input type="text" name="departure"><br>
Duration:      <input type="text" name="flightDuration"><br>
FlightNumber:  <input type="text" name="flightNumber"><br>
Price:         <input type="text" name="price"><br>
Seats:         <input type="text" name="seats"><br>
      <input type="submit" value="Save">
</pre>
</form>
<a href="readAll">Read Records</a>


 
  




${saved}

</body>
</html>