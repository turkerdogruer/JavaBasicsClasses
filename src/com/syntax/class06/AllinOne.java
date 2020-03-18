package com.syntax.class06;

import java.util.Scanner;

public class AllinOne {
	
	public static void main(String[] args) {
		
		//ask user if there is a sale
		//if there is no sale ---> not going shopping
		//if sale we will ask price of the item
		//based on the price we will calculate final price
		//if price of the item less then 20 ---> apply 10%
		//if price between 20 and 100 --> apply 20%
		//if price between 100 and 500--> apply 50%
		//if price more than 500 --> apply 50%
		//after discount-----  the price of the item reduced from ----- to-----------
		
		Scanner scan;
		String sale;
		double price=0;
		double discount = 0;
		double finalPrice = 0;
		
		scan=new Scanner(System.in);
		 System.out.println("Is there any sale ? ");
		sale=scan.nextLine();
		
		if(sale.equalsIgnoreCase("yes")) {
			System.out.println("How much is that ?");
			price=scan.nextInt();
			if(price<20) {
				discount=price*0.10;
				
			}else if(price>=20 && price<=100) {
				discount=price*0.20;
				
			}else if(price>=100 && price<=500) {
				discount=price*0.30;
			}else if(price>500) {
				discount=price*0.50;
			}
			finalPrice=price-discount;
			System.out.println("after discount "+discount+" the price of the item reduced from "+price+" to "+finalPrice);
		
		}else {
			System.out.println("Not going shopping");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
