package com.syntax.class05;

public class moreLogicalOperators {

	public static void main(String[] args) {

		/*
		 * we have total 7 days in a week if day is 2 or 3----> sdlc class if day
		 * 6,7---- java class if day 1,5 off day if day 4 ----> review class
		 */

		int day;
		day = 3;

		if (day == 2 || day == 3) {
			System.out.println("Today is SDLC class");

		} else if (day == 6 || day == 7) {
			System.out.println("Today is java class");

		} else if (day == 1 || day == 5) {
			System.out.println("Today is no class");
		} else if (day == 4) {
			System.out.println("Today is review class day");
		} else {

			System.out.println("Invalid day");
		}

		System.out.println("-------------------------------------");

		String day1 = "Saturday";

		if (day1.equals("Tuesday") || day1.equals("Wednesday")) {

			System.out.println("Today is SDLC class");
		} else if (day1.equals("Saturday") || day1.equals("Sunday")) {

			System.out.println("Today is Java class");

		}

	}

}
