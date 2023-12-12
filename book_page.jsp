<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Page</title>
</head>
<body>

<form action="bookticket" method="post">
<pre>
FirstName:           <input type="text" name="firstName"/>
LastName :           <input type="text" name="lastName"/>
Gender:              <input type="select" name="gender"/>
Email:               <input type="text" name="email"/>
Mobile               <input type="text" name="mobile"/>
Seats Available:     <input type="text" name="seats" value="${record.seats}">
    <input type="submit" value="Book">
</pre>
</form>
</body>
</html>