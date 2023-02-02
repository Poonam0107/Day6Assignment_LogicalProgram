package com.day6assignment;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int sum=0;
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("Given number is perfect");
			
		}
		else
		{
			System.out.println("Given number is not perfect");
		}
		

	}
	int divisor(int x)
	{
		return x;
	}

}
