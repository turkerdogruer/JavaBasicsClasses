package com.syntax.class07;

import java.util.Scanner;

public class luckyExampleAselway {

	public static void main(String[] args) {
		

		//we are playing a lottery and a luck number is 17
		//ask user any number 1-20 until he guess our number---->
		
		
		Scanner scan;
		int number;
		int luckyNumber=17;
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Please enter any number 1 - 20");
			number=scan.nextInt();
			
		}while(number!=luckyNumber);
		
		System.out.println("You got it !!!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
