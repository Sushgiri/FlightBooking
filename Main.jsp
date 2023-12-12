<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main page</title>
<style>
h2{
margin-left:700px;
}
.for{
margin-left:700px;
}


</style>
</head>
<body>
<h2> Welcome</h2>
<h2>Search Flights</h2>

<a href="adminlog">AdminLogin</a>

<div class="for">
<form action="searchrecord" method="post">

<pre>
<input type="text" placeholder="From"  name="originating"/> <input type="text" placeholder="Destination" name="destination"/> <input type="submit" value="Search"/>
</pre>
</div>
</form>
<table border="">
<tr>


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
  </tr>
  </C:forEach>
</body>
</html>