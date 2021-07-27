package com.day3PP.LineComparison.uc;

import java.util.Scanner;

public class DayThreeUCTwo {

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
       
       System.out.println(x1 == x2);
       System.out.println(y1 == y2);
       
       
       
	}

}

