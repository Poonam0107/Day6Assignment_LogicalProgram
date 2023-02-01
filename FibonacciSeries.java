package com.day6assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=15;
		int a=0;
		int b=1;
		int c;
		for (int i=1;i<=n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;b=c;
		}

	}

}
