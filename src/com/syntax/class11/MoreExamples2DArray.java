package com.syntax.class11;

public class MoreExamples2DArray {

	public static void main(String[] args) {
		
		//lets create 2 array in which we store professions
		
		String[][] professions= {
				{"QA Tester","Developers","product Owner","Scrum Master"},
	            {"Math Teacher","Science Teacher","ESL Teacher"},
	            {"Dentist","Surgeon"}  
		};
		
		//get elements usin enhanced for loop
		
		for(String[] x:professions) {
			for(String y:x) {
			System.out.print(y+" ");
				
			}
			System.out.println();
		}
		
		
		
		
		}
         
}
