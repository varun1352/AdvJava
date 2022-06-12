<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Word Actions</title>
</head>
<form action="WordActionsServlet" method = "post">
Enter the word of your choice
<input type ="text" name = "word" value = "${wordValue}"/>${wordError}
<br>
Choose a format in which you want to print the word
<br>
<select name="format" id="format">
  <option value="UpperCase">Upper Case</option>
  <option value="LowerCase">Lower Case</option>
  <option value="Reverse">Reverse</option>
</select>${FormatError}

<button type="submit">Submit</button>
</form>
<body>

</body>
</html>