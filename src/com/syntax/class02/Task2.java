package com.syntax.class02;

public class Task2 {

	public static void main(String[] args) {

		float x, y;
		int w, h;
		int z, b;

		x = 1.99f;
		w = 5;
		z = 3;
		y = 2.50f;
		h = 8;
		b = 9;
		float sum = x + y;
		int area = w * h;
		float mult = x * y;
		int perimeter = 2 * (w + h);
		float sub = x - y;
		float div = x / y;

		String a = "additional";
		String s = "subtraction";
		String m = "multiplication";
		String d = "division";

		System.out.println("The " + a + " of 2 numbers " + x + " and " + y + " is equal to " + sum);
		System.out.println("The " + m + " of 2 numbers " + x + " and " + y + " is equal to " + mult);
		System.out.println("The " + s + " of 2 numbers " + x + " and " + y + " is equal to " + sub);
		System.out.println("The " + d + " of 2 numbers " + x + " and " + y + " is equal to " + div);
		System.out.println("The square of the " + z + " is " + b);
		System.out.println("the perimeter of a rectangle with  widht " + w + " and height " + h + " is equal to "
				+ perimeter + " and the area is " + area);

	}

}
