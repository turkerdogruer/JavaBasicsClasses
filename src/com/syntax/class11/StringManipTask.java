package com.syntax.class11;

import java.util.Scanner;

public class StringManipTask {

	public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
		
		
		String username = null;
		String password = null;
		String confirmedPassword=null;
		String message=null;
		
		if(!(username.isEmpty() || password.isEmpty()))  {
			message="lets proceed";
			if(password.length()>=8) {
				
				if(!password.contains(username)) {
					
					System.out.println("please confirm password");
					confirmedPassword=scan.nextLine();
					
					if(password.contentEquals(confirmedPassword)) {
						System.out.println("your account is created");
					}
					
					
				}else {
					System.out.println("password cannot contain username");
				}
				
				
			}else {
				System.out.println("Password is too short");
			}
			
			
			
			
		}else {
			
			message="user name and password cannot be emty";
		}
		
		
		System.out.println(message);
		
		

	}

}
