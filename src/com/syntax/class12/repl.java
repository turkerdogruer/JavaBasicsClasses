package com.syntax.class12;

import java.util.Scanner;

public class repl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter the browser name to proceed further with execution");
	    String browser = sc.nextLine(); 
	    
	    String result="Proceed with "+browser+" browser";
	    
	   if(browser.equalsIgnoreCase("ChRoME")){
	     
	   }else if(browser.equalsIgnoreCase("FireFox")) {
		   
	   }else if(browser.equalsIgnoreCase("IE")) {
		   
	   }else {
		   System.out.println("Invalid browser");
	   }
	    
	    System.out.println(result);
}
}