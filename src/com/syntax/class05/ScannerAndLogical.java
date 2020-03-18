package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {

		/*
		 * you are sales man ask a user for ow much his sales are based on the amount of
		 * sales we need to calculate commission if sales is between 1 - 100 dollars--->
		 * commission should be 10% if sales is between 100-200----> commission 20% if
		 * sales is between 200-500-----> commission should be 30& if sales is more than
		 * 500---> commission should be 50%
		 */

		// 1. declare all varables

		Scanner scan;
		double sales;
		double commission;

		scan = new Scanner(System.in);
		System.out.println("Please enter your sales amount");
		sales = scan.nextDouble();

		if (sales >= 1 && sales <= 100) {
			commission = sales * 0.10;

		} else if (sales > 100 && sales <= 200) {
			commission = sales * 0.20;

		} else if (sales > 200 && sales <= 500) {
			commission = sales * 0.30;
		} else {
			commission = sales * 0.50;

		}

		System.out.println("based on your sales your commission is = " + commission);
		if(commission>100) {
			System.out.println("You are awsome seller");
		}
		
	}

}
