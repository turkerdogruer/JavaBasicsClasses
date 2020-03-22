package com.syntax.class14;

 class Furniture {
	
	static String name ="chair";
	static int size = 10;
	
	static void handmade() {
		
		System.out.println(name+" size of "+size+" inch and is handmade");
	}
	static void wood() {
		
		System.out.println(name+" size of "+size+" inch and  made by wood");
	}
	
	public static void main(String[] args) {
		
		wood();
		handmade();
	}

}