package com.syntax.class12;

import java.util.Scanner;

public class recapmore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   

     Scanner input=new Scanner(System.in);
     
     
     System.out.println("Please enter a String");
     String x=input.nextLine();
     
     if(x.contains("a")) {
     System.out.println(x.replace('a', 'o'));
     
     }if (x.contains("o")) {
    System.out.println(x.replace('o', 'i'));
    	 
     }
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
