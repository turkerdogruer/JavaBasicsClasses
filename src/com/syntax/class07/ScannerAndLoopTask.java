package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoopTask {

	public static void main(String[] args) {
		
		
		//we are playing a lottery and a luck number is 17
		//ask user any number 1-20 until he guess our number---->
		
		
		
		Scanner input;
		int num=17;
		
		input=new Scanner(System.in);
		
		while(num<=17 || num>=17) {
			System.out.println("Please enter any number between 1 - 20");
			num=input.nextInt();
			if(num==17) {
				System.out.println("you win gratz");
				num++;
		
		break;
		}else {
			System.out.println("Please try again");
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
