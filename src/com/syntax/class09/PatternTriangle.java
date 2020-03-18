package com.syntax.class09;

public class PatternTriangle {

	public static void main(String[] args) {
		
		//4 rows  4 columns  special triangle/pyramid
		
		for(int x=1; x<=4; x++) {
			
			for(int y=1; y<=x; y++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
		

	}

}
