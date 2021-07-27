package com.day3.uc1;

public class DayThreeUCFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int workingDayOfMon=20;
		int salForfullDayHour=8;
		int monthlyWagesis=0;
		
		for(int i =0;i<=20;i++) {
			monthlyWagesis = monthlyWagesis+ (workingDayOfMon*salForfullDayHour);
			
		}
		
	
		System.out.println("Your Salary For a month is ." + monthlyWagesis);
		
			}

}
