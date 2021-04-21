<%@page import="com.getterSetter" %>
<%@page import="CRUD.edit_val" %>
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
	int id =Integer.parseInt(request.getParameter("id"));	
	String fname= request.getParameter("fname");
	String lname= request.getParameter("lname");
	String Email= request.getParameter("Email");
	int phone = Integer.parseInt(request.getParameter("phone"));
	
	getterSetter beans= new getterSetter();
	beans.setId(id);
	beans.setFname(fname);
	beans.setLname(lname);
	beans.setEmail(Email);
	beans.setPhone(phone);
	
	edit_val edit = new edit_val();
	
	edit.edit_users(beans);
%>
<script type="text/javascript">

window.location.href="http://localhost:8080/usersProject/insert.jsp"
</script>

</body>
</html>