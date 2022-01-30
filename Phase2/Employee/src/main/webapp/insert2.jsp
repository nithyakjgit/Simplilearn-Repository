<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.project.empbean.Empbean" %>
	<%@ page import="com.project.empdao.Empdao" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Page</title>
</head>
<body>
<%
Empbean eb= new Empbean();
eb.setEmpno(Integer.parseInt(request.getParameter("empno")));
eb.setEmpname(request.getParameter("empname"));
Empdao crud=new Empdao();
int row=crud.insert(eb);
if(row>0){
    out.println("insertion successful");
    %>

    <form action="retrive.jsp">
    <input type="submit" value="retrive">
    </form>


    <%}


else{
    out.println("chck the insertion");
}
%>


</body>
</html>