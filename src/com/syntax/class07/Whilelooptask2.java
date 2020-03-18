package com.syntax.class07;

public class Whilelooptask2 {

	public static void main(String[] args) {
	
		
		
		
		for(int x=1; x<20; x++  ) {
			if(x % 2 != 0) {
				
				System.out.print(x);
			}
			
		}
		
	
		
		//first way incrementing by 2
		
		int y=1;
		
		while(y<20) {
			
			System.out.println(y);
			y+=2;
		}
		
		
		//2 way using mod operator
		
		int z=1;
		while(z<=20) {
			
			if (z % 2 !=0) {
				System.out.println(z);
				}
			z++;
		}
		
		
		
		

	}

}
