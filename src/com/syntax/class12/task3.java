package com.syntax.class12;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		

	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your moms name");
	String mname=input.nextLine();
	System.out.println("Please neter your dads name");
	String dname=input.nextLine();
	System.out.println("Expected Gender");
	String gender=input.nextLine();
	
	if(gender.equalsIgnoreCase("Boy")){
		
		System.out.println(dname.substring(0, dname.length()/2)+(mname.substring(mname.length()/2)));
	}else {
		
		System.out.println(mname.substring(0,mname.length()/2)+(dname.substring(dname.length()/2)));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
