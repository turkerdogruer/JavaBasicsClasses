package com.syntax.class14;

import java.util.Scanner;

public class phoneexecution {

	public static void main(String[] args) {

        phone phone1=new phone();
        
        phone1.make="Iphone";
        phone1.model="XS";
        phone1.os="ios";
        
        phone1.easytouse();
        phone1.dimensions();
        phone1.helpsupport();
        
        phone phone2=new phone();
        phone2.make="samsung";
        phone2.model="s7";
        phone2.os="android";
        
        phone2.easytouse();
        phone2.dimensions();
        phone2.helpsupport();
		
		
		String str="Hello friends";
		
		str=str.replace("Hello", "Welcome");
		
		System.out.println(str);
		
		
		Scanner scan=new Scanner(System.in);
		
		scan.hasNextLine();
		
		

	}

}
