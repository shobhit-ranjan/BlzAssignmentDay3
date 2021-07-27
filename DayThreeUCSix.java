package com.day3.uc1;

public class DayThreeUCSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int workingDayOfMon=20;
		int salForfullDayHour=8;
		int monthlyWagesis=0;
		int day=0;
		int workinghour=0;
		
		for(int i =0;i<=50;i++) {
			if( workinghour < 100 && day < 19 )
			 {
			monthlyWagesis = monthlyWagesis+ (workingDayOfMon*salForfullDayHour);
			workinghour=workinghour+8;
            day=day+1;
			
			System.out.println(workinghour);
			System.out.println(day);
		   }
		}
	
		System.out.println("Your Salary For a month is ." + monthlyWagesis);
		

	}

}
