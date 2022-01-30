<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.Connection" %>
    <%@page import="java.sql.DriverManager" %>
    <%@page import="java.sql.Statement" %>
    <%@ page import="java.sql.*" %>
     <%@ page import="com.project.empbean.Empbean" %>
	<%@ page import="com.project.empdao.Empdao" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Form</title>
</head>
<body>
<h1>Employee update</h1>

  <form method="post" action="">
  <% 
  ResultSet rs;
  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperation","root","Nithya*123");
  String empno=request.getParameter("u");
  int  no=Integer.parseInt(empno);
  PreparedStatement ps=con1.prepareStatement("select * from Employee where empno='"+no+"'");
  
  rs=ps.executeQuery();
  while(rs.next()){
	  %>  

 <form > 
 <div class="form-group">
<label>Empno</label><input type="text" name="empno" value="<%=rs.getString("empno") %>">
</div><br>
<br>
<div class="form-group">
<label>Empname</label><input type="text" name="empname" value="<%=rs.getString("empname") %>">
</div><br>
<br>
  
 <% 
 } 
 %>
 <form action="update.jsp">
    <a href="update.jsp">Update</a>
    </form>

 
 

 <div align="center">
 <a href="index.jsp">click here</a>
 </div>
 </div>
</form>

</body>
</html>


