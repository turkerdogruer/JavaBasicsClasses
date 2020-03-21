package com.syntax.class12;

public class Recapmanipulations {

	public static void main(String[] args) {
		
		
		String str="Good Morning Students!";

		char letter1=str.charAt(0);
		
		System.out.println(letter1);
		
		char letter2 = str.charAt(5);
		
		System.out.println(letter2);
		
		// get all characters by 1 by?
		
		for(int x =0; x<str.length(); x++ ) {
			
			System.out.print(str.charAt(x)+" ");
		}
		System.out.println();
		
		//indexof
		System.out.println("++++++++++++++++++++++++++++");
		
		String name ="Syntax Technologies";
		
		int index= name.indexOf('x');
		System.out.println(index);
		
		int index2 =name.indexOf("Syntax");
		int index3=name.indexOf("Technologies");
		int index4= name.indexOf('s');
		
		
		System.out.println(index2+" "+index3+" "+index4);
		
		
		int mix= name.indexOf('o',13);
		
		System.out.println(mix);
		
		int mix2= name.lastIndexOf('o');
		System.out.println(mix2);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
