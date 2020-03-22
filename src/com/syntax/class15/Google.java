package com.syntax.class15;

public class Google {
//define features such as name id name last name salary
//define behavior working, attending meetings,

	int id;
	String name, lastname, title;
	double salary;

	void work() {

		System.out.println(title + " is working");
	}

	void getPaid() {

		System.out.println(name + " is getting paid " + salary);
	}

	void attendMeetings() {

		System.out.println(name + " attending meetings");
	}

	public static void main(String[] args) {
		
		Google emp1=new Google();
		emp1.id=123;
		emp1.name="John";
		emp1.lastname="Smith";
		emp1.title="CEO";
		emp1.salary=200000;
		emp1.work();
		emp1.getPaid();
		emp1.attendMeetings();
		System.out.println();
		Google emp2=new Google();
		emp2.id=124;
		emp2.name="Seyma";
		emp2.lastname="Atasoy";
		emp2.title="QA Engineer";
		emp2.salary=100000;
		emp2.work();
		emp2.getPaid();
		emp2.attendMeetings();
		

	}

}
