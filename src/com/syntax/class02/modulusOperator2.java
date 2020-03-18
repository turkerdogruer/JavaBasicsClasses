package com.syntax.class02;

public class modulusOperator2 {

	public static void main(String[] args) {

		float f = 12.50f;
		float f1 = 2.7f;

		double d = 12.50;
		double d1 = 2.7;

		float result = f / f1;

		System.out.println(result);
        // not possible to store decimal numbers to integer
		// we can store integer nums to double
		int i = 12;
		int y = 7;
		int result2 = i / y;
		double result3 = d / d1;

		System.out.println(result2);
		System.out.println(result3);

		// modulus % remainder

		int v = 16;
		int w = 7;

		int mod = v % w;
		System.out.println(mod);

		// i would like to divide 12/7

		// int num1=12.5;

		double num2 = 12;

		System.out.println(num2);// 12.0

	}

}
