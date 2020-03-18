package com.syntax.class05;

import java.util.Scanner;

public class PracticeLogicOps {

	public static void main(String[] args) {

		Scanner input;
		int heights;

		System.out.println("Enter your height in inches");
		input = new Scanner(System.in);

		heights = input.nextInt();
 
		if(heights> 0 && heights<60) {
			System.out.println("Short");
		}else if(heights>=60 && heights<=72) {
			System.out.println("Medium");
		}else if(heights>72){
			System.out.println("Tall");
		}else {
			System.out.println("Invalid");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
