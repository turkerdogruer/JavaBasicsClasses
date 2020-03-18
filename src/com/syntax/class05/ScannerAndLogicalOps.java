package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOps {
	
	
	public static void main(String[] args) {
		
		/*take age input from a user then based on age print output
		 * if age from 0-3--->you are a baby
		 * if age from 4-5--> you are a kid
		 * if age 6-12--->you are a child
		 * if age 13-19---> you are teenager
		 * if age from 20--64-->you are an adult
		 * if age is more or equal to 65 --->you are a senior
		 */
		
		
		//1.lets declare all variables
		
		
		int age;
		Scanner scan;// to import we use Ctrl+shift+o
		
		//2.Capture values
		scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		 age=scan.nextInt();
		
				
		//3.perform verification
		 //if you checking range then will be and &&
		 //if you check exact then will be || or
		 
		 
		if(age>0) {
		 if(age>=0 && age<=3) {
			 System.out.println("You are a baby");
		 }else if(age>=4 && age<=5) {
			 System.out.println("You are a kid");
		 }else if(age>=6 && age<=12) {
			 System.out.println("You are a child");
		 }else if(age>=13 && age<=19) {
			 System.out.println("You are and adult");
		 }else if(age>=20 && age<=64) {
			 System.out.println("You are an adult");
		 }else {
			 System.out.println("you are a senior");
		 }
		 
	}else {
			 System.out.println("Invalid");
		 }
		 
		
		
		
		
		
		
		
		
	}

}
