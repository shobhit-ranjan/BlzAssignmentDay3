package com.day3.uc1;

import java.util.Random;

public class DayThreeUCFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wagePerHour=20;
		 int fullDayHour=8;
		 int HalfDayHour=4;
		Random random = new Random();
		int rand = 0;
		while (true){
		    rand = random.nextInt(4);
		    if(rand !=0) 
		    	break;
		}
		
		//System.out.println(rand);
		switch (rand) {
		case 1:
			  System.out.println("Employee is present.");
              int salaryForToday=(wagePerHour*fullDayHour);
              System.out.println("Today you got " + salaryForToday);
			break;
			
		case 2:
		       System.out.println("Employee is present for halfday ");
	    	   int salaryForTodayis=(wagePerHour*HalfDayHour);
	    	   System.out.println("Today you got " + salaryForTodayis);
			break;	
			
			
        default:
			  System.out.println("Employee is Abesent");
	          System.out.println("No Salary for Today.");
			
		}
	}

}
