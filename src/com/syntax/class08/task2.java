package com.syntax.class08;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {

   //Create a program that will be asking user to apply for a credit card 10 times. 
		//As soon you get an “yes” from a user program should stop asking.
		
		
		Scanner input=new Scanner(System.in);
		String yes=null;
		
		for(int x=1; x<=10; x++) {
			System.out.println("Apply for creditcard");
			yes=input.nextLine();
			
			if(yes.equals("yes")) {
				System.out.println("applied");
				break;
				
			}
			
		}
	
		
		
		
		

	}

}
