package com.syntax.class04;

public class MoreNestedIf {
	
	public static void main(String [] args) {
		
		//declare date a day
		//if day is friday ---> if day is 13 ---> wtach a scary movied
		//                 ----> if day is not 13---> watch a comedy
		
		
		boolean isFriday=false;
		int date=13;
		
		if(isFriday) {
			System.out.println("today is friday, i am going to a movie");
			
			if(date==13) {
				
			System.out.println("i'll watch scary movie");
			}else {
				System.out.println("i will watch a comedy");
			}
			
			
			
		}else {
			
			System.out.println("today is not friday, im staying home");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
