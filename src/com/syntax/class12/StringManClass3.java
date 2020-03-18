package com.syntax.class12;

public class StringManClass3 {

	public static void main(String[] args) {
		
		System.out.println("_______________subsstring() Funct_________________");
		
		
		//to get substring from a given String
		String str="Today is a rainy day";
		
		String partialString=str.substring(6);
		System.out.println(partialString);
		//rainy day
		partialString=str.substring(11);
		System.out.println(partialString);
		
		//today
		partialString=str.substring(0, 5);
		System.out.println(partialString);
		
		//rainy
		partialString=str.substring(11, 16);
		System.out.println(partialString);
		
		
		

	}

}
