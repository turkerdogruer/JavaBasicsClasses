package com.syntax.class04;

import java.util.Scanner;

public class taskScanner {
	
	/*You are a loan specialist and you need to ask user what is the amount of loan is needed. 
	 * If loan is less than 200,000 then you would lend the money otherwise you would reject the client.
	
	 */
	public static void main(String[] args) {
		
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("What is the amount of loan do you want ?");
		
		int x=input.nextInt();
		
		if(x<=200000) {
			
			System.out.println("XX bank can provide you loan");
		}else {
			
			System.out.println("Sorry we can't");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
