package com.syntax.class09;

public class ArrayCreate2way {

	public static void main(String[] args) {
		
		
		
		String[] carArray;//this way preferable
		String carArray1[];//might use like that
		
		carArray=new String[3];
		carArray[0]="BMW";
		carArray[1]="HONDA";
		carArray[2]="TOYOTA";
		
		//i am driving toyota
		
		System.out.println("I am driving "+carArray[2]);
		
		////////////////////////////////////////
		
		int[] numbers=new int[3];
		numbers[0]=100;
		numbers[1]=200;
		numbers[2]=300;
		//change to values of numbers[1]
		numbers[1]=2000;
		
		System.out.println(numbers[1]+numbers[0]);//2100
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
