package com.syntax.class03;

public class ifCondition {

	public static void main(String[] args) {

		// declare a number and compare if number is larger than 100
		// if number is larger than 100--->my number is large

		System.out.println("Starting code");

		int num = 178;

		if (num > 100) {
			System.out.println("My number is large");
		}

		System.out.println("End of the program");
		System.out.println("---------------------------");

		int expectedHours = 15;
		int actualHours = 15;

		if (actualHours >= expectedHours) {
			System.out.println("You will love Java");
		} else {
			System.out.println("You won't like Java");
		}

		System.out.println("-------------------------");

		double budget = 10000;
		double carPrice = 12000;

		if (budget >= carPrice) {

			System.out.println("i will buy this car today");
			System.out.println("i will be happy");
		} else {

			System.out.println("i won't buy this car," + " i will go learn Java");
			System.out.println("i will be motivated");
		}

		System.out.println("i am code after if condition");

		System.out.println("------------------------");

		boolean flag = false;

		if (flag) {

			System.out.println("hello");
		} else {
			System.out.println("bye");
		}

	}

}
