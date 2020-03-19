package com.syntax.class13;

public class Question5 {

	public static void main(String[] args) {
		
		//Write a java program to reverse String? Reverse a string word by word?
		
		
		String given="i love java";
		String reversed="";
		
		for(int i =given.length()-1; i>=0; i--) {
			
			reversed=reversed+given.charAt(i);
		}
		
		System.out.println(reversed);
		
		
		String [] array=given.split(" ");
		String reverseWord="";
		for(int i =array.length-1; i>=0; i--) {
			
			reverseWord=reverseWord+array[i];
		}
		System.out.println(reverseWord);

	}

}
