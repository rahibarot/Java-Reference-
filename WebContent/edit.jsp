<%@page import="com.getterSetter" %>
<%@page import="CRUD.edit_val" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edits</title>
</head>
<body>

	<%
		int id=Integer.parseInt(request.getParameter("id"));
		
		edit_val edit= new edit_val();
		
		getterSetter beans = new getterSetter();
	%>
	
<center>
	<h1>Edit the database:</h1>
	
	<form action="control/edit_controls.jsp">
		User-id: <input type="text" name="id" value="<%=id %>"><br>
		(Your id is last four digit of your phone number and birthdate) <br>
		
		First Name: <input type="text" name="fname" value="<%beans.getFname();%>"> <br>
		Last Name:	<input type="text" name="lname" value="<%beans.getLname();%>"> <br>
		E-Mail: <input type="text" name="Email" value="<%beans.getEmail();%>"> <br>
		Phone: <input type="text" name="phone" value="<%beans.getPhone(); %>"> <br>
		
		<input type="submit" value="Edit">
	</form>
</center>

</body>
</html>