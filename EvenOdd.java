package com.app;

import java.util.Scanner;

public class EvenOdd {
	  public static void main(String[] args)
	    {
	        
		  System.out.println("Enter a number");
	      Scanner sc = new Scanner(System.in);
	         int num = sc.nextInt();      
	        if (num % 2 == 0) {
	
	            System.out.println("Entered Number is Even");
	        }
	 
	        else {
	
	            System.out.println("Entered Number is Odd");
	        }
	    }
	}

