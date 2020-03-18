package com.syntax.class09;

public class ArraysHW2 {
	
	public static void main(String[] args) {
		//Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).
		
		//1.way
		String[] names=new String[6];
		names[0]="Turker";
		names[1]="Reyhan";
		names[2]="Gulsum";
		names[3]="Senel";
		names[4]="Selma";
		names[5]="Yunus";
		
		System.out.println(names[5]);
		
		//2.way
		
		String[] names2= {"Yunus","Selma","Senel","Reyhan","Gulsum","Turker"};
		
		System.out.println(names2[0]);
		
		
		
		
		
		
		
		
	}

}
