package com.project.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	 public static Connection dbConn() throws ClassNotFoundException, SQLException {
	   	 Class.forName("com.mysql.cj.jdbc.Driver");
	   	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperation","root","Nithya*123");
	   	 return con;
	    }

	}


