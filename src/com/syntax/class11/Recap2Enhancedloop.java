 package com.syntax.class11;

public class Recap2Enhancedloop {

	public static void main(String[] args) {
		
		
		String[][] groceries= {{"cucumber","potato","carrot",},{"mango","apple","banana","kiwi"},{"milk","cheese","yogurt"}};

		
		
		for(String[] array:groceries) {
			for(String items:array) {
				
				System.out.print(items+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
