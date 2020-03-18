package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {
		
		
		//for loop is like all in one  declaration and testing condition and increment
		// while loop best choice when you dont know exactly number of iterations
		//for loop is best choice when you know number of iteration
		
		//good morning 5 times
		
		for(int c=1; c<6; c++) {
			
			System.out.println("Good morning");
		}
		
		
		//print number 1 to 10
		
		for(int i=1; i<=10; i++ ) {
			System.out.print(i);
			System.out.print(" ");
		}
		//print numbers from 10 to 1
		
		for(int x=10; x>=1; x--) {
			System.out.print(x);
			System.out.print(" ");
		}
		
		//what will be output
		
		for(int z=0; z<=50; z+=5) {
			System.out.print(z);
			System.out.print(" ");
		}
		
		//What is the output
		int sum=0;
		for(int x=1; x<5; x++) {
			sum=sum+x;
		
		}
		
		System.out.println(sum);
		
		
		
	}

}
