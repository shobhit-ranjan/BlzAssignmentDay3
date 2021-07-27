package com.day3.uc1;

public class DayThreeUCThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 int wagePerHour=20;
		 int fullDayHour=8;
		 int HalfDayHour=4;
		 double randomDouble = Math.random();
	      randomDouble = randomDouble * 10 + 1 ;
	      int randomInt = (int) randomDouble;
	      System.out.println(randomInt);
	      
	      if(randomInt%2==0)
	      {
	            System.out.println("Employee is present.");
	            int salaryForToday=(wagePerHour*fullDayHour);
	            System.out.println("Today you got " + salaryForToday);
	      }
	      else if (randomInt%5==0||randomInt%7==0)
	      {
	    	  System.out.println("Employee is present for halfday ");
	    	   int salaryForToday=(wagePerHour*HalfDayHour);
	    	   System.out.println("Today you got " + salaryForToday);
	      }
	      
	      else
	      {
	    	  System.out.println("Employee is Abesent");
	          System.out.println("No Salary for Today.");
	      
	      }

}
}
