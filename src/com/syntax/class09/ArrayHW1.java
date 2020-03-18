package com.syntax.class09;

public class ArrayHW1 {
	
	public static void main(String[] args) {
		
	
	//create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).

	//1.way
	char[] grade=new char[6];
	grade[0]='A';
	grade[1]='B';
	grade[2]='C';
	grade[3]='D';
	grade[4]='E';
	grade[5]='F';
	
	System.out.println(grade[1]);
	
	//2.way
	
	
	char[] grade2= {'A','B','C','D','E','F'};
	
	System.out.println(grade2[1]);
	//getting all elements
	
	for(int x=0; x<grade2.length; x++) {
		
		System.out.println(grade2[x]);
	}
	
	
	System.out.println("====printing using advanced for loop====");
	
	for(char x:grade2) {
		System.out.print(x+" ");
	}
	
	
	
	
	
	
	
	
	
	
	}
}
