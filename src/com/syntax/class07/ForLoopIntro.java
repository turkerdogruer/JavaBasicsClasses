package com.syntax.class07;

public class ForLoopIntro {

	public static void main(String[] args) {
		
		
		//good morning 5 times
		
		for(int c=1; c<6; c++) {
			
			System.out.println("Good morning");
		}
		
		//print numbers from 1 to 10
		
		for(int x=1; x<=10; x++) {
			System.out.println(x);
		}
		
		//print numbers from 10 to 1
		
		for(int y=10; y>=1; y--) {
			System.out.println(y);
		}		
		
		
		//what will be output?
		
		for(int z=0; z<50; z+=5) {
			System.out.println(z);
		}
		
		System.out.println("--------------------");
		//what is the output
		
		int sum=0;
		
		for(int i=1; i<5; i++) {
			sum=sum+i;
		
		}System.out.println(sum);
		

	}

}
