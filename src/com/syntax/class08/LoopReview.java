package com.syntax.class08;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {

		/*
		 * ask for user pay for a candy As long as the entered price is not 2 dolar we
		 * need to keep ask for paying once amount is correct------->"enjoy your candy?"
		 */
//1.way
		Scanner s;
		double price;
		s = new Scanner(System.in);

		do {
			System.out.println("Please pay for a candy");
			price = s.nextDouble();
		} while (price != 2);
		System.out.println("Enjoy your candy");
	
	
	
		
		
	
	
	
	
	
	
	
	
	}

}
