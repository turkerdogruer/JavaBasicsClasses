package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
	
		String school="Syntax  ";
		
		String str=new String("Hello");
		
		String str1="this is a String 7676,&^&^";
		
		
		//find out how many character string has
		//.length is calculate you how many characters inside 
		System.out.println("============length func==============");
		   System.out.println(school.length());
		   
	        int size=str.length();
	        System.out.println(size);
		
System.out.println("==========lower and upper case funct===============");
	     //convert string lower case or Upper case
	        
	       System.out.println(school.toUpperCase());
	         
	       System.out.println(str.toLowerCase());
	       
	        str=str.toLowerCase();
	        System.out.println(str);
	     System.out.println("+++++++++++++concat func+++++++++++++");   
	     
	     //Concatenate  2  string  ***************** 
	        
	       String newstring=str+" "+school;
	        
	        System.out.println(newstring);
	        
	        
	        String day ="Saturday";
	        String date ="14";
	        
	        
	        String newdate = day.concat(" "+date);
	        System.out.println(newdate);
	        
	        
	        
	        //char +string
	          char grade='A';
	        String str3="Student";
	        //below code will be error since concat method is used to attached 1 string to another
	        //str.concat(grade);


	        System.out.println("+++++++++++++++is Empty func++++++++++++++++");
	        
	        //check empty or not with boolean
	        String str4="";
	         boolean empty =str4.isEmpty();
	        System.out.println(empty);
	        
	        System.out.println("+++++++++++++Trim() func+++++++++++++++");
	        
	        String str5="    Welcome to Syntax!    ";
	        //only cut empty spaces at(Leading) start point and end point(Trailing) never cut middle(Inside)
	          str5=str5.trim();
	        System.out.println(str5);
	        
	        
	        System.out.println();
	        
	        
	        //length() ----> how many characters
	        //toUppercase()/toLowercase------> converts to upper or lower
	        //empty()--------->checks if any characters inside the String
	        //trim() -----------> cuts spaces before and after string
	        //equals()/equalsIgnoreCase --------------> compares two strings
	        //contains() ------> checks if certains sequaence of character or characters present in the string
	        //startwith / endWith ----->check if string starts or ends with particular seq. of characters
	        //concat() ----> to attach 1 string to another
	        
	        
	        
	        
	        
	        
	        
	        
	        
	}

}
