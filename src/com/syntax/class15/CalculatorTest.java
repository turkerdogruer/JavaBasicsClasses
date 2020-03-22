package com.syntax.class15;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		Calculator calc = new Calculator();
		calc.add(x, y);
		calc.sub(x, y);
		calc.mult(x, y);
		calc.div(x, y);

	}

}
