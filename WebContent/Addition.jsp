<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition</title>
</head>
<body>
<form action="AdditionServlet" method = "post">
Input the first number = <input type="number" name = "Num1">
<br>
<br>
Input the Second number = <input type="number" name = "Num2">
<br>

<input type = "radio" value = "Addition" name = "Radio">Addition
<br>
<input type = "radio" value = "Subtraction" name = "Radio">Subtraction
<br>
<input type = "radio" value = "Multiplication" name = "Radio">Multiplication
<br>
<input type = "radio" value = "Division" name = "Radio">Division
<br>
<button type = "submit">Submit</button>
</form>
</body>
</html>