package com.syntax.class09;

public class PatternzoomGroup {

	public static void main(String[] args) {
		
		
		for(int x=1; x<6; x++) {//row
			for(int y=1; y<=x; y++) {//column
				
				System.out.print("* ");
			}
			System.out.println();
		}
			
			
		for(int x=0; x<4; x++) {
			for(int y=4; y>x; y--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
