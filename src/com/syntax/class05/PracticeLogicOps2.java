package com.syntax.class05;

import java.util.Scanner;

public class PracticeLogicOps2 {

	public static void main(String[] args) {

		Scanner input;
		int day;
		System.out.println("please enter a day number");
		input = new Scanner(System.in);
		day = input.nextInt();

		if (day >= 1 && day <= 5)
			System.out.println("It is a weekday");
		else if (day >= 6 && day <= 7)
			System.out.println("It is a weekend");
		else
			System.out.println("Invalid day");

		
		System.out.println("--------------------------------------------");
		
		
		if(day==1 || day==2 || day==3 || day==4 || day==5)
			System.out.println("It is a weekday");
		else if(day==5 || day==6)
			System.out.println("It is a weekend");
		else {
			System.out.println("Invalid day");
		}
		
		
		
		
	}

}
