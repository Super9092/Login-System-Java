package com.project;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class Register {
	    public static boolean registerUser(User user) {
	        try {
	            Connection con = DBConnection.getConnection();
	            String query = "INSERT INTO users(name, email, password) VALUES(?,?,?)";

	            PreparedStatement ps = con.prepareStatement(query);
	            ps.setString(1, user.name);
	            ps.setString(2, user.email);
	            ps.setString(3, user.password);

	            int result = ps.executeUpdate();
	            return result > 0;

	        } catch (Exception e) {
	            System.out.println(e);
	            return false;
	        }
	    }
	}

