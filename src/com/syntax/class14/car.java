package com.syntax.class14;

public class car {
//feature
	String make;
	String model;
	String color;
	int year;

	//Behavior
	void drive() {

		System.out.println(color+" "+make+" can drive");
	}

	void accelerate() {
		
		System.out.println(color+" "+make+" can accelerate");
	}	
	
	void makeNoise() {
		
		System.out.println(color+" "+make+" can make noise");
	}
	
	void stop() {
		System.out.println(color+" "+make+" stops when you press break");
		System.out.println(" stops");
	}
	
	
	
	
}
