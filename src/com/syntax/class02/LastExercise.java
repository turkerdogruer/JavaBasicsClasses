package com.syntax.class02;

public class LastExercise {
	
	public static void main(String[] args) {
		
		
		int a=10;
		int b=22;
		
		String x="Hello";
		String y="bye";
		
		System.out.println(a+b+x+y);
		System.out.println(a+x+b+y);
		
		
		System.out.println(x+y+a+b);//Hellobye1022 it does not add plus because if string go first rest of numbers will not plus or mult or div or sub
		
		//program execute top to bottom and let to right.   after word numbers not adding only concatenation but you can separete with pharentehsis 
		
		//such as:
	
		System.out.println(x+y+(a+b));
		
	}

}
