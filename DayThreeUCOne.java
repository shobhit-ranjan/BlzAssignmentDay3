package com.day3.uc1;

public class DayThreeUCOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double randomDouble = Math.random();
	      randomDouble = randomDouble * 10 + 1 ;
	      int randomInt = (int) randomDouble;
	      System.out.println(randomInt);
	      
	      if(randomInt%2==0)
	           System.out.println("Employee is present.");
	      
	      else
	    	  System.out.println("Employee is Abesent");
	      
	      
	      
   }

}
