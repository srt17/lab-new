package com.app;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		
	    
			  System.out.println("Enter dividend");
			  
		      Scanner sc = new Scanner(System.in);
		         int num1 = sc.nextInt();
		         
		         System.out.println("Enter divisor");
		         int num2 = sc.nextInt();
		  
		        int quotient = num1 / num2;
		        int remainder = num1 % num2;
		  
		        System.out.println("The Quotient is : " + quotient);
		        System.out.println("The Remainder is : " + remainder);
		    }
		

	}


