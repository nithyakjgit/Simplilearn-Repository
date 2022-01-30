<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.project.empdao.Empdao" %>
	<%@ page import="java.sql.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Empdao crud=new Empdao();
ResultSet rs=crud.show();
out.println("Empno"+"  "+"Empname");
%>
  <br>
<%
while(rs.next()){
    
    out.println(rs.getInt(1)+"  "+rs.getString(2)+"\n");
    %>
    <a href="Edit.jsp?u=<%= rs.getInt("empno")%>" class="btn btn-danger">>Edit</a> 
     <a href="Delete.jsp?d=<%= rs.getString("empno")%>" class="btn btn-danger">Delete</a>   <br>
    <br>
    <%} %>



</body>
</html>