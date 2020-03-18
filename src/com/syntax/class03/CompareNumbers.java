package com.syntax.class03;

public class CompareNumbers {

	public static void main(String[] args) {
		
		double x=10;
		double y=10;
		
		
		
		if(x>y) {
			
			System.out.println("Double value "+x+" is larger than "+y);
		}else if(x<y){
			
			System.out.println("Double value "+x+" is smaller than "+y);
		}else {
			
			System.out.println("Numbers are equal");
		}
		
		System.out.println("---------------------------------");
		
		//declare variable for a day and then based on the value we will provide output
		
		int day=4;
		
		if(day==1) {
			System.out.println("Monday off day");
		}else if(day==2) {
			System.out.println("Tuesday SDLC class");
		}else if(day==3) {
			System.out.println("Wednesday SDLC class");
		}else if(day==4) {
			System.out.println("Thursday Review class");
		}else if(day==5){
			System.out.println("Friday off day");
		}else if(day==6) {
			System.out.println("Saturday Java class");
		}else if(day==7) {
			System.out.println("Sunday Java class");
		}else {
			
			System.out.println("!!!!!");
		}
		
				
	}

}
