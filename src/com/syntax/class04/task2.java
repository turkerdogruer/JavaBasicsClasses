package com.syntax.class04;

public class task2 {

	public static void main(String[] args) {

		int mortgagePrice = 350000;
		double rate = 3;

		if (rate > 4.5) {

			System.out.println("too high not buy");
		} else {

			System.out.println("will consider buy");
			if (mortgagePrice > 300000) {

				System.out.println("will take a loan");
			} else {

				System.out.println("will buy cash");
			}
		}
		

	}

}
