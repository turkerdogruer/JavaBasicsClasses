package com.syntax.class07;

import java.util.Scanner;

public class LoopsandScanner {

	public static void main(String[] args) {
		
		
	//we want to ask users name 5 times and print  5 times good afternoon
			
			
			
			Scanner input;
			String name;
			int num=1;
			
			input=new Scanner(System.in);
			
			while(num<=5) {	
				
			System.out.println("What is your name");
			
			name=input.nextLine();
			
			System.out.println("Good afternoon "+name);
                num++;
			}
			
			
			
			
			
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
