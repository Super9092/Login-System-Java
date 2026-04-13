package com.project;
import java.util.Scanner;
public class MainApp {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("1. Register");
	        System.out.println("2. Login");

	        int choice = sc.nextInt();

	        if (choice == 1) {
	            System.out.print("Enter name: ");
	            String name = sc.next();

	            System.out.print("Enter email: ");
	            String email = sc.next();

	            System.out.print("Enter password: ");
	            String password = sc.next();

	            User user = new User(name, email, password);

	            if (Register.registerUser(user)) {
	                System.out.println("Registration Successful");
	            } else {
	                System.out.println("Failed");
	            }

	        } else if (choice == 2) {
	            System.out.print("Enter email: ");
	            String email = sc.next();

	            System.out.print("Enter password: ");
	            String password = sc.next();

	            if (Login.loginUser(email, password)) {
	                System.out.println("Login Successful");
	            } else {
	                System.out.println("Invalid Credentials");
	            }
	        }
	    }
	
}

