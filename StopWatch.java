package com.day6assignment;

import java.util.Scanner;

public class StopWatch {
	

	public static void main(String[] args) throws InterruptedException 
	{	
     	Scanner sc=new Scanner(System.in);
		long start,end;
		double time;
		System.out.println("Type any character to start stopwatch :");
		char s=sc.next().charAt(0);
		start=System.currentTimeMillis();
		System.out.println("Type any character to stop stopwatch :");
		char m=sc.next().charAt(0);
		end=System.currentTimeMillis();
		time=(end-start)/1000F;
		System.out.println(time);
	  }

}
