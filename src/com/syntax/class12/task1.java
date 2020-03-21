package com.syntax.class12;

public class task1 {

	public static void main(String[] args) {

		String i = "sundays are goody";

		if (!(i.isEmpty())) {

			if (!(i.length() % 2 == 0) && i.length() > 3) {

				System.out.println(i.substring(i.length() / 2));

			} else {
				System.out.println("sting is not odd number of char");
			}

		} else {

			System.out.println("String is empty");
		}

	}

}
