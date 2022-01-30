package com.project.empdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.dbconnection.DbConnection;
import com.project.empbean.Empbean;

public class Empdao {
	  public int insert(Empbean eb) throws ClassNotFoundException, SQLException {
		   	 String sql="insert into Employee values(?,?)";
		   	 Connection con=DbConnection.dbConn();
		   	 PreparedStatement ps=con.prepareStatement(sql);
		   	 ps.setInt(1,eb.getEmpno() );
		   	 ps.setString(2,eb.getEmpname());
		   	 return ps.executeUpdate();
		   	 
		    }
		    
		    public ResultSet show() throws ClassNotFoundException, SQLException {
		   	 Connection con=DbConnection.dbConn();
		   	 String sql="select * from Employee";
		   	 PreparedStatement ps=con.prepareStatement(sql);
		   	 return ps.executeQuery();
		    }
		    

			public int delete(Empbean eb1) throws ClassNotFoundException, SQLException {
				String sql = "DELETE FROM student  WHERE id=?";
				Connection con=DbConnection.dbConn();
				PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,eb1.getEmpno());
				return ps.executeUpdate();
				 
}
			public int update(Empbean eb2) throws  SQLException, Exception {
				 String sqlUpdate = "UPDATE Employee SET empname = ? WHERE empno = ?";
				 Connection con=DbConnection.dbConn();
			PreparedStatement ps = con.prepareStatement(sqlUpdate);
			 ps.setInt(2,eb2.getEmpno() );
		  	 ps.setString(1,eb2.getEmpname());
			return ps.executeUpdate();
		  
		  	
			
			 }
}