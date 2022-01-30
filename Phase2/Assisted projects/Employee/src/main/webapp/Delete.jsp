<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.project.empdao.Empdao" %>
     <%@ page import="com.project.empbean.Empbean" %>
    <%@page import="java.sql.Connection" %>
    <%@page import="java.sql.DriverManager" %>
    <%@page import="java.sql.Statement" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String empno=request.getParameter("d");
int  no=Integer.parseInt(empno);
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperation","root","Nithya*123");
Statement stmt=con.createStatement();
stmt.executeUpdate("delete from Employee where empno= '"+no+"'");
response.sendRedirect("retrive.jsp");


%>


</body>
</html>