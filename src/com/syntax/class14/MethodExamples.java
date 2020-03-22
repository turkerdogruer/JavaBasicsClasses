package com.syntax.class14;

public class MethodExamples {

	void greet() {

		System.out.println("Hello Sarmed");
	}
	
	void greet1(String name) {
		
		System.out.println("Hello "+name);
	}

	public static void main(String[] args) {
    //class name variable-new class name
	MethodExamples	object1=new MethodExamples();
	
	    object1.greet1("Sarmed");
	    object1.greet1("Faisal");
	    object1.greet1("John");
	    object1.greet1("Gulen");
	   
	   
	    
	    object1.greet();
	 
	    	
		
	}

}
