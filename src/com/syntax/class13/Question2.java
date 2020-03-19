package com.syntax.class13;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		//Write a java program to check whether a given number is prime or not?
		//not divisible by other numbers except 1 and itself
		
		 int num = 4;
	        boolean flag = false;
	        for(int i = 2; i <= num/2; ++i)
	        {
	            // condition for non prime number
	            if(num % i == 0)
	            {
	                flag = true;
	                break;
	            }
	        }

	        if (!flag)
	            System.out.println(num + " is a prime number.");
	        else
	            System.out.println(num + " is not a prime number.");
		
		
		
		

	}

}
