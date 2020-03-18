package com.syntax.class11;

public class Array2Task {

	public static void main(String[] args) {
		// Create an array of countries: 
		//north america countries, south america countries, europe countries, asian countries, african countries.
		//Then print all values from that array using 2 different loops and calculate how many total countries been stored
	
	
	String[][]  countries={
			{"Canada","Alaska","USA"},
			{"Brasil","Peru","Mexico","Uruguay"},
			{"Germany","France","Italy","Portugal"},
			{"China","Mongolia","Japan"},
			{"Congo","Morocco","Iraq","UAE"},
			};
	
	int sum=0;
	for(String[] x:countries) {
		for(String y:x) {
			
			System.out.print(y+" ");
			sum+=1;
		}
		System.out.println();
		
	}
	
	System.out.println("Total stored  "+sum);
	
	
	System.out.println("+++++++++++++");

	for(int x=0; x<countries.length; x++) {
		for(int y=0; y<countries[x].length;y++) {
			System.out.print(countries[x][y]+" ");
		}
		System.out.println();
	}
	
	System.out.println(countries.length);
	
	}

}
