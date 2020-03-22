package com.syntax.class15;

public class Methods {

	// create a method that will say welcome 10 times

	void greed(String welcome) {

		for (int x = 0; x < 11; x++) {

			System.out.print(welcome);
		}
		
		// will say any word # any words number of times
	}

	void sayAnything(String word, int times) {

		for (int x = 1; x <= times; x++) {

			System.out.println(word);
		}
	}
    //create method  isitraining that will accept boolean value as a parameter
	//and based n the value it print message
	
	void isItRaining(boolean isRain) {
		
		if(isRain) {
			System.out.println("Stay home");
		}else {
			System.out.println("Go walk");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
