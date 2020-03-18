package com.syntax.class04;

import java.util.Scanner;

/*You are DMV representative and you need to ask customer their age. 
 * If they are 18 and older you will issue a driver licence to them, 
 * otherwise you will offer them to get a learners permit.
 * 
 */

public class task2Scanner {
	
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("How old are you?");

		int x=input.nextInt();
		
		if(x>=18) {
			
			System.out.println("Yes! we can issue to a driver Licence");
		}else {
			
			System.out.println("Sorry First you have to get learners permit");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
