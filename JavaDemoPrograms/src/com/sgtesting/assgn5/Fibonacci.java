package com.sgtesting.assgn5;

public class Fibonacci {

	public static void main(String[] args) {//1st 10 fibonnaci series
		int a=0;int b=1,c;
		System.out.print(a+" "+b);
		for(int n=1;n<=8;n++)//or n=2;n<10
		{
			c=a+b;		
			System.out.print(" "+c);
			a=b;
			b=c;			
		}

	}

}
