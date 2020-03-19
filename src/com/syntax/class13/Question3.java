package com.syntax.class13;

public class Question3 {

	public static void main(String[] args) {
		//Write a Java Program to print first 10 numbers of Fibonacci series.
		
		int a,b,c;
		a=0;
		b=1;
		
		for(int i=1; i<=10; i++) {
			
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println();
			System.out.println("++++++++++++++");
			//diff way
			
			int[] fib = new int[10];
			fib[0] = 0;
			fib[1] = 1;
			for (int x = 2; x < 10; x++) {// to find rest fibonacci until 10
				fib[x] = fib[x - 1] + fib[x - 2];
			}
			for (int j = 0; j < 10; j++) {// number of index
				System.out.print(fib[j] + " ");
			}
			
		
	

	}

}
