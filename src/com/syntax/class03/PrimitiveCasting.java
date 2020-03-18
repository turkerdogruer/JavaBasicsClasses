package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
	
		//widening, happens implicitly 
	double d=10;
	System.out.println(d);//10.0
	
	//int i=10.99;-->compile time error saying 
	//type mismatch, cannot double to integer
	
	
	
	// narrowing, explicitly implementing
	int i=(int)10.99;
	System.out.println(i);
	
	//byte -128 to 127
	
	
	byte b=(byte)1284;
	System.out.println(b);
	
	double z=345.987;
	
	int w=(int)z;
	
	System.out.println(w);
	
			
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
