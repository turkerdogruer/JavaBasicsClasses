package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {

		// once i=4---> we want to stop the loop
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				System.out.println("stop loop");
				break;
			}
			System.out.println("Inside in the loop");
			System.out.println(i);
		}

		System.out.println("im outside of the loop");

		

		System.out.println("---------------Continue---------------");
		
		
		
		for (int y=1; y<=10; y++) {
			if(y==4) {
				System.out.println("i am skipping iteration");
			continue;
		
			}
		System.out.println(y);
		}
		System.out.println("---------------------------------------");
		
		
		
		for(int i=1; i<21; i++) {
			
			if(i==5 || i==6 || i==7) {
				continue;
				
			} 
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
