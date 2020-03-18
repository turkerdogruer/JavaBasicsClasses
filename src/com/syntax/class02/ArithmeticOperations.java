package com.syntax.class02;

public class ArithmeticOperations {
	
	/*Declare 2 variables and initialize them
	 * display result of addition, subtraction, multiplication, and division
	 */
	
	public static void main(String[] args) {
		
		
		int num1, num2;
		
		num1=20;
		num2=10;
		
		System.out.println(num1+num2);  //30
		System.out.println(num1-num2);  //10
		System.out.println(num1*num2);  //200
		System.out.println(num1/num2);  //2
		
		System.out.println(num1+","+num2);
		
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		//the addition of 2 numbers is______
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		System.out.println("The additon of 2 numbers are "+sum+" and the subtraction of 2 numbers are "+sub);
		System.out.println("The multiplication of 2 numbers are "+mult+" and the division of 2 numbers are "+div);
		
		
		
		
		
	}

}
