<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import="java.sql.*" %>
     <%@ page import="com.project.empbean.Empbean" %>
	<%@ page import="com.project.empdao.Empdao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
 Empbean eb2= new Empbean();

eb2.setEmpno(Integer.parseInt(request.getParameter("empno")));
 eb2.setEmpname(request.getParameter("empname"));
 Empdao crud1=new Empdao();
 int rows=crud1.update(eb2);
 	
 if(rows>0){
	    out.println("updated successful");
	    %>

	   


	    <%}
 else{
	    out.println("unsuccesfull");
	}
 
	%>
</body>
</html>