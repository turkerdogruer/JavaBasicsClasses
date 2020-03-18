package com.syntax.class06;

import java.util.Scanner;

public class SwitchwithStrings {

	public static void main(String[] args) {
		//ask a user where are you from
		//based on the country we will define favorite food
		//output your favorite food is -----------
		
		
		Scanner input;
		String country;
		String Ffood;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=input.nextLine();
		
		
		switch(country.toLowerCase()){
			
			case "morocco":
				Ffood="couscous";
				break;
			case "belarus":
				Ffood="Potato";
				break;
			case "tajikistan":
				Ffood="Osh";
			    break;
			case "turkey":
				Ffood="Baklava";
				break;
			case "afganistan":
			    Ffood="Mantu";
			    break;
			case"kazakhstan":
				Ffood="BeshParmak";
				break;
			default:
				Ffood="Unknown";
				
			
		}
		System.out.println("Your favorite food is "+Ffood);
		
		
		
		
	
		
		
		
	}

}
