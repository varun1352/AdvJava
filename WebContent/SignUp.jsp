<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
SignUp Page
</h1>
<br>
<form action="SignUpServlet">
Enter your Name : <input type="text" value="${FirstNameValue}" name="FirstName">${FirstNameError}
<br>
<br>
Enter your EmailId : <input type="text" value="${EmailIdValue}" name="EmailId">${EmailIdError}
<br>
<br>
Enter your age : <input type = "number" value = "${AgeValue}" name="Age">${AgeError}
<br>
<br>
<button type="submit">Submit</button>
</form>
</body>
</html>