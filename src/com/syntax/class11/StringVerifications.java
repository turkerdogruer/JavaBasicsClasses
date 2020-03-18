package com.syntax.class11;

public class StringVerifications {

	public static void main(String[] args) {


		String message="Welcome Admin";
		
		//verify that message contains username which is admin
		System.out.println("++++++++++++++++Contains func+++++++++++++");
		System.out.println(message.contains("Admin"));
		
		boolean flag=message.contains("welcome");
		System.out.println(flag);
	
		
		
		//we want to see if welcome message stars with welcome
		System.out.println("+++++++++++++++startswith() Func++++++++++++++++++++");
		boolean starts=message.startsWith("Welcome");
		System.out.println(starts);
		System.out.println("++++++++++++++++++ENdswith() func++++++++++++++++++++++++");
		//we want to verify that welcome message ends with user name
		String username="Admin";
		boolean ends=message.endsWith(username);
		System.out.println(ends);
		System.out.println(message.endsWith("!"));
		
	

	}

}
