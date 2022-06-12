<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String FirstName = (String)(request.getAttribute("FirstNameValue"));
	String EmailId = (String)(request.getAttribute("EmailIdValue"));
	String Age = (String)(request.getAttribute("AgeValue"));
	
%>
FirstName : <%=FirstName%>
<br>
EmailId : <%=EmailId%>
<br>
Age : <%=Age%>
<br>
</body>
</html>