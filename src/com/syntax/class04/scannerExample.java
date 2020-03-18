package com.syntax.class04;

import java.util.Scanner;

public class scannerExample {
	
	
	public static void main(String [] args) {
		//Capture name from a user
				//priint inthe format
				//my name is--------
		
		Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your name");
	
	String name=scan.nextLine();
	System.out.println("my name is " +name);
	
	System.out.println("how old are you?");
	int age=scan.nextInt();
	
	System.out.println("Your name is "+name+" your age is "+age );
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
