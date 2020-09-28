package com.academy.kant.UserRegistration;

import java.util.*;
public class UserRegistrationMain {
    
	public static boolean validateFirstName(String fname) {
    	
		/*Shubham : valid
		 * shubham : Invalid: start with capital case
		 * Shu : valid :
		 * shu : invalid
		 * Sh : invalid
		 * 
		 * */
    	String pattern = "[A-Z]{1}[a-zA-Z]{2,}";
    	
    	return fname.matches(pattern);
    }
	
    public static boolean validateLastName(String lname) {
    	
		/*Kumar : valid
		 * kumar : Invalid: start with capital case
		 * Kum : valid :
		 * kum : invalid
		 * Ku : invalid
		 * 
		 * */
    	String pattern = "[A-Z]{1}[a-zA-Z]{2,}";
    	
    	return lname.matches(pattern);
    }
	
	public static boolean validateEmail(String email) {
		
		/*
		 * shubh.kumar@blib.co.in: true
		 * s.kum@gmail.com: false
		 * s.Kumar@Capgemini.co.in : true
		 * sh12Kum@Capgemini.co.in : true
		 * */
		
		String pattern = "^([a-zA-Z]+[a-zA-Z._0-9]*[a-zA-Z0-9]+)[@]([a-zA-Z]{2,}[.][a-zA-Z]{2,}[.][a-zA-Z]{2,})$";
       
		return email.matches(pattern);
	}
    
	public static boolean validateMobile(String mobNo) {
		
		String pattern = "[0-9]{2}[ ][0-9]{10}";
		return mobNo.matches(pattern);

	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		
		String fname = sc.nextLine();
		
		while(!validateFirstName(fname)) {
			System.out.println("Invalid!! Enter first name again: ");
			fname = sc.nextLine() ;
			
		}
		
        System.out.println("Enter last name: ");
		
		String lname = sc.nextLine();
		
		while(!validateLastName(lname)) {
			System.out.println("Invalid!! Enter last name again: ");
			lname = sc.nextLine() ;
			
		}
		
        System.out.println("Enter email: ");
		
		String email = sc.nextLine();
		
		while(!validateEmail(email)) {
			System.out.println("Invalid!! Enter email again: ");
			email = sc.nextLine() ;
			
		}
		
        System.out.println("Enter mob no: ");
		
		String mobNo = sc.nextLine();
		
		while(!validateMobile(mobNo)) {
			System.out.println("Invalid!! Enter mobile no again: ");
			mobNo = sc.nextLine() ;
			
		}
		
		
	}
}
