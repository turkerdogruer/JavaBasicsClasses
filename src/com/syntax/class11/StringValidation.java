package com.syntax.class11;

public class StringValidation {

	public static void main(String[] args) {
		
		
		String str1="Welcome Syntax students";
		
		String str2="Welcome Syntax Students";
		
		
		//to compare to strings
		System.out.println("++++++++++++equals() or equalsignorecase() Func");
	
		
		//ignore case  ignoring case sensitiveness
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String expected="Home - Syntax Technologies";
		String actual= "   Home - Syntax Technologies ";
		//
         if(actual.equals(expected)) {
        	 System.out.println("Test case passed. titles are matched");
         }else {
        	 System.out.println("Test case not passed. titles are  not matched");
         }
		
		
         System.out.println("++++++++++++++first trim and then compare chain ");
         
         if(actual.trim().equals(expected)) {
        	 
        	 System.out.println("Test case passed. titles are matched");
         }else {
        	 System.out.println("Test case not passed. titles are not matched");
         }
         
         System.out.println("+++++++++++++++++++++++++++++++++");
         String browser="CHROME";
         if(browser.trim().equalsIgnoreCase("chrome")) {
        	 System.out.println("Test executed on chrome browser");
         }
         
         //or
         
         if(browser.toLowerCase().equals("chrome")) {
        	 
        	 System.out.println("Test executed on chrome browser");
         }
         
         
         
         
         
         
         
         
         
		
	}

}
