package com.syntax.class08;

public class LoopCalculate {

	public static void main(String[] args) {

		// write a program o calculate sum of odds and sum off even numbers
		// 1-99

		int sumx = 0;
		int sumy = 0;

		for (int x = 1; x <= 99; x++) {
			if (x % 2 != 0) {
				sumx = sumx + x;

			}
		}

		for (int y = 1; y <= 99; y++) {
			if (y % 2 == 0) {
				sumy = sumy + y;
			}

		}

		System.out.println("odd total " + sumx);
		System.out.println("even total " + sumy);

	}

}
