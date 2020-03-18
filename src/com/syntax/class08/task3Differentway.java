package com.syntax.class08;

import java.util.Scanner;

public class task3Differentway {

	public static void main(String[] args) {
		

	
		 int num1;
	        int  num2;
	        int  min ;
	        int  max ;
	        int  sumEven = 0;
	        int  sumOdd = 0;
	        Scanner scan = new Scanner(System.in);
	        scan = new Scanner(System.in);
	        System.out.println("Please enter enter two differnt numbers");
	        num1 = scan.nextInt();
	        num2 = scan.nextInt();
	        if (num1>num2) {
	            min=num2;
	            max = num1;
	        }else {
	            min=num1;
	            max=num2;
	        }//Write a program that reads a range of integers (start and end point), 
	        //provided by a user and then from that range prints the sum of the even and odd integers.
	        
	        for (int  i = min; i <= max; i++) {
	            if (i % 2 == 0) {
	                sumEven = sumEven + i;
	            } else {
	                sumOdd = sumOdd + i;
	            }
	        }
	        System.out.println("The total of even numbers between " + min + " to " + max + " = " + sumEven);
	        System.out.println("The total of even numbers between " + min + " to " + max + " = " + sumOdd);

	
	
	
	
	
	
	
	
	
	
	
	}

}
