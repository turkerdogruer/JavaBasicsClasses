package com.syntax.class10;

public class recap {

	public static void main(String[] args) {
		
		
		int[] grades=new int[4];
		
		grades[0]=90;
		grades[1]=67;
		grades[2]=89;
		grades[3]=78;
		//what is the avarege?
		
		int average=(grades[0]+grades[1]+grades[2]+grades[3])/4;
		
		System.out.println("Average grade is "+average);
		
	//=============================================================================
       System.out.println("=====================Creating an array of cities===========================");


       String[] cities= {"DC","NY,","Paris","Miami","Los Angeles","Dallas","Chantilly"};
       
       System.out.println("i live in "+cities[2]);
       
       int x=1;
       System.out.println(cities[x]);
       
       x+=3;
       System.out.println(cities[x]);
       //how many elements
       int arraySize=cities.length;
       
       System.out.println("Total elements "+arraySize);
       
       //how can we access last element from array
       
       System.out.println(cities[cities.length-1]);
       System.out.println(cities[arraySize-1]);
       System.out.println("============================================");
       //access all elements from an array
       
       for(int i=0; i<arraySize; i++) {
    	   
    	   System.out.println(cities[i]);
       }
       
      










	}

}
