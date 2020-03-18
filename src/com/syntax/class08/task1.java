package com.syntax.class08;

public class task1 {

	public static void main(String[] args) {
		
		//Print numbers from 1 to 50 except those that are divisible by 3
		
		for(int x=1; x<=51; x++) {
			
			if(x%3 ==0) {
				continue;
			}
			System.out.println(x);
		}
		
		
	}

}
