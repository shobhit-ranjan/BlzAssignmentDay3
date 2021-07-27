package com.day3PP.LineComparison.uc;

import java.util.Scanner;

public class DayThreeUCOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the Value Of X1");
       double x1=sc.nextDouble();
       
       System.out.println("Enter the Value Of Y1");
       double y1=sc.nextDouble();
       
       System.out.println("Enter the Value Of X2");
       double x2=sc.nextDouble();
       
       System.out.println("Enter the Value Of Y2.");
       double y2=sc.nextDouble();
       
       
       
       double LengthOfLine = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
       System.out.println("Length Of Your Line is  "+ LengthOfLine);
       
	}

}
