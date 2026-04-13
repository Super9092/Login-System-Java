package com.project;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
	
	
	
	    public static Connection getConnection() {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            return DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/userdb",
	                "root",
	                "password"   // replace with your password
	            );
	        } catch (Exception e) {
	            System.out.println(e);
	            return null;
	        }
	    }
	}

