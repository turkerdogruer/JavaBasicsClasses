package com.syntax.class10;

public class EnhancedArrayFruits {

	public static void main(String[] args) {

         //advanced for loop,enhanced for loop
		String[] fruits= {"banana","kiwi","apple","mango"};
		
		for(String x:fruits) {
			if(x.equals("apple")) {
			System.out.println(x+" is my favorite fruit");
			
			}else {
				System.out.println(x);
			}
		}
		System.out.println("===============================");
		//long way with for loop
		
		for(int x=0; x<fruits.length; x++)
		{
			System.out.println(fruits[x]);
		}
		
		
	}

}
