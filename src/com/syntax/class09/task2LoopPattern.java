package com.syntax.class09;

public class task2LoopPattern {
	
	public static void main(String[] args) {
		
		
		for(int x=1; x<5; x++ ) {
			
			for(int y=5; y>0; y--) {
				
				System.out.print(y);
			}
			System.out.println();
		}
		
		
		System.out.println("====================");
		
		
		for(int x=5; x>0; x--) {
			
			for(int y=5; y>0; y--) {
				System.out.print(x);
			}
			System.out.println();
			
		}
		
	}

}
