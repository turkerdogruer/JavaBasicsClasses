package com.syntax.class11;

public class ArrayTask {

	public static void main(String[] args) {
		
		//Create an array of cars : american, german, korean, italian. 
		//Then retrieve all values from that array using 2 different loops
		
		
		   String[][]	cars= {{"American","German","Korean","italian"},{"Chevy","BMW","KIA","Maserati"}};	
		
		
		for(String[] x:cars) {
			for(String y:x) {
			
			System.out.print(y+" ");
		}
			System.out.println();
		}
		
		for(int x=0;x<cars.length;x++) {
			for(int y=0; y<cars[x].length;y++) {
			
			System.out.println(cars[x][y]);
			}
	}

	}

}
