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
		
		
		
	}
}
