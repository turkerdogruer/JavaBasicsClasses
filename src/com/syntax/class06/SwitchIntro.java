package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {

		int day = 3;
		String dayName;

		if (day == 1) {
			dayName = "Monday";
		} else if (day == 2) {
			dayName = "Tuesday";
		} else if (day == 3) {
			dayName = "Wednesday";
		} else if (day == 4) {
			dayName = "Thursday";
		} else if (day == 5) {
			dayName = "Friday";
		} else if (day == 6) {
			dayName = "Saturday";
		} else if (day == 7) {
		    dayName = "Sunday";
		}else {
			dayName="Invalid";
		}
		
		System.out.println("Today is "+dayName);
		System.out.println("-----------Using Switch--------------");
		
		String today;
		
		
		switch(day) {
		
		case 1:
			today="Monday";
			break;
		case 2:
			today="Tuesday";
			break;
		case 3:
			today="Wednesday";
			break;
		case 4:
			today="Thursday";
			break;
		case 5:
			today="Friday";           //when not using break will give you wrong answer break stopping you execution in right answer
			break;                    // you can use logical operators in switch case also can t use relational >=
		case 6:                       // you can t use boolean and double or float and long
			today="Saturday";
			break;
		case 7:
			today="Sunday";
			break;
		default:
			today="Invalid";
			}
		
		System.out.println("Today is "+today);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
