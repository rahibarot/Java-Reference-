<%@page import="com.getterSetter" %>
<%@page import="CRUD.edit_val" %>
<%@page import="CRUD.insert_val" %>
<%@page import="CRUD.delete_val" %>
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

delete_val delete = new delete_val();

 delete.delete_val(id);
%>

<script type="text/javascript">
window.location.href="http://localhost:8080/usersProject/insert.jsp"
</script>

</body>
</html>