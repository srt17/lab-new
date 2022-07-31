package com.app;
import java.util.Scanner;
public class ASCII {

	public static void main(String[] args) {
		
		
		   
		      System.out.println("Enter a character");
		      Scanner sc = new Scanner(System.in);
		      char ch = sc.next().charAt(0);
		      System.out.println(" the entered character is :" + ch);
		      int value = ch;
		      System.out.println("ASCII value of  given character is :" + value);
		   

	}

}
