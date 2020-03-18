package com.syntax.class11;

public class Recap2dArray {

	public static void main(String[] args) {
		
		
		String[][] groceries= {{"cucumber","potato","carrot",},{"mango","apple","banana","kiwi"},{"milk","cheese","yogurt"}};
		
		for(int r=0; r<groceries.length;r++) {
			for(int c=0; c<groceries[r].length; c++) {
				
				System.out.print(groceries[r][c]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		

	}

}
