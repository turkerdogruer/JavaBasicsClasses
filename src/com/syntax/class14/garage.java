package com.syntax.class14;

public class garage {

	public static void main(String[] args) {

		car car1 = new car();

		car1.make = "Lamborghini";
		car1.model = "Gallardo";
		car1.year = 2020;
		car1.color = "Blue";

		car car2 = new car();
		
		car2.make ="BMW";
		car2.model="M5";
		car2.year=2019;
		car2.color="Pink";

		
		System.out.println("I drive "+car2.color+" "+car2.make);
		System.out.println("++++++++++++++++++++++");
		// Accessing behavior/methods of car
		car1.drive();
		car1.accelerate();
		car1.makeNoise();
		car1.stop();
		System.out.println("i drive "+car1.make);
		car2.drive();
		car2.accelerate();
		car2.makeNoise();
		car2.stop();
		
		
	}

}
