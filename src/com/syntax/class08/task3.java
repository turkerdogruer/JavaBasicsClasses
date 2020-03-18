package com.syntax.class08;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan;
		double num1;
		double num2;
		double sumEven = 0;
		double sumOdd = 0;

		scan = new Scanner(System.in);
		System.out.println("Please enter enter two differnt numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();

		for (double i = num1; i < num2; i++) {
 
			if (i % 2 == 0) {// if this (for loop) is false statement will run second loop because
				sumEven = sumEven + i;
			} else {
				sumOdd = sumOdd + i;
			}

		}
		for (double i = num1; i > num2; i--) {//second loop  working completely when first (for loop) is false
			if (i % 2 == 0) {
				sumEven = sumEven + i;
			} else {
				sumOdd = sumOdd + i;
			}
		}

		System.out.println("The total of even numbers between " + num1 + " to " + num2 + " = " + sumEven);
		System.out.println("The total of odd numbers between " + num1 + " to " + num2 + " = " + sumOdd);

	}

}
