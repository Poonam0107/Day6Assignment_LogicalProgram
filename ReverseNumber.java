package com.day6assignment;

public class ReverseNumber {
	static int reverse (int n)
	{
		int rev=0;
		int rem;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int n=4563;
		System.out.println("Reverse Number is :"+reverse(n));
		

	}

}
