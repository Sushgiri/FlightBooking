<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="">
<tr>

<th>From</th>
<th>Destination</th>
<th>Arrival</th>
<th>Deaprture</th>
<th>Duration</th>
<th>FlightNumber</th>
<th>Price</th>
<th> Availabe Seats</th>
<th> Delete</th>
<th> Update</th>


</tr>

 <C:forEach var ="record" items = "${record}">
  <tr>
  <td>${record.originating }</td>
  <td>${record.destination }</td>
 <td>${record.arrvial }</td>
  <td>${record.departure }</td>
  <td>${record.flightDuration }</td>
 <td>${record.flightNumber }</td>
  <td>${record.price }</td>
  <td>${record.seats}</td>
 
  <td><a href = "delete?id=${record.id }">delete</a></td>
    <td><a href = "update?id=${record.id}">update</a></td>
  
 
 </tr>
</C:forEach>
</table>

</body>
</html>