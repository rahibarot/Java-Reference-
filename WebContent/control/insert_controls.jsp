<%@page import="CRUD.insert_val" %>
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
	int id= Integer.parseInt(request.getParameter("id"));
	String fname= request.getParameter("fname");
	String lname = request.getParameter("lname");
	String Email= request.getParameter("Email");
	int phone = Integer.parseInt(request.getParameter("phone")); //how to insert a phone number 
	
	insert_val insert= new insert_val();
	
	insert.inset_val(id, fname, lname, Email, phone);
	
%>

<script type="text/javascript">
window.location.href="http://localhost:8080/usersProject/insert.jsp"
</script>

</body>
</html>