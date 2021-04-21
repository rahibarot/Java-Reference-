<%@page import="com.getterSetter" %>
<%@page import="CRUD.read_val" %>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert </title>
</head>
<body>

	<center>
		<h1>Fill out the Form</h1>
		<form action="control/insert_controls.jsp">
			User ID: <input type="text" name="id"><br>
			(Your ID is last four digit of your phone number and birthdate) <br>
			
			First Name: <input type="text" name="fname"> <br>
			Last Name: <input tyoe="text" name="lname"> <br>
			E-Mail: <input type="text" name="Email"> <br>
			Phone: <input type="text" name="phone"> <br>
			
			<input type="submit" value="Insert">
		</form>
		<hr>
		<%
		read_val read= new read_val();
		
		List<getterSetter> list= read.get_vals();
		
		Iterator<getterSetter> it= list.iterator();
		%>
		<table border="1">
		<%
		while(it.hasNext()){
			getterSetter beans= new getterSetter();
			
			beans=it.next();
		
		%>
		<tr>
			<td><%=beans.getId() %> </td>
			<td><%=beans.getFname() %></td>
			<td><%=beans.getLname() %></td>
			<td><%=beans.getEmail() %> </td>
			<td><%=beans.getPhone() %> </td>
		</tr>
<%
}  //while loop ends here
%>
		</table>
		
	</center>
</body>
</html>