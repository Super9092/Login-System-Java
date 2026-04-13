package com.project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login {
	
	
	
	    public static boolean loginUser(String email, String password) {
	        try {
	            Connection con = DBConnection.getConnection();
	            String query = "SELECT * FROM users WHERE email=? AND password=?";

	            PreparedStatement ps = con.prepareStatement(query);
	            ps.setString(1, email);
	            ps.setString(2, password);

	            ResultSet rs = ps.executeQuery();
	            return rs.next();

	        } catch (Exception e) {
	            System.out.println(e);
	            return false;
	        }
	    }
	}

