package com.syntax.class14;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dog dog1 = new dog();

		dog1.breed = "great dane";
		dog1.color = "black";
		dog1.name = "hanzo";
		dog1.age = 6;

		dog dog2 = new dog();
		dog2.breed = "chow chow";
		dog2.color = "brown";
		dog2.name = "hera";
		dog2.age = 5;

		
	System.out.println("I wish i have "+dog1.breed+" and "+dog2.color+" "+dog2.breed);
		
	dog1.eat();
	dog1.run();
	dog2.eat();
	dog2.run();
	
	
		
	}
	
	
	}



class dog {

	String breed;
	String color;
	String name;
	int age;
	
	
	void eat() {
		
		System.out.println(breed+" Eating to much");
	}
	void run() {
		
		System.out.println(breed+" running slow");
	}
}









