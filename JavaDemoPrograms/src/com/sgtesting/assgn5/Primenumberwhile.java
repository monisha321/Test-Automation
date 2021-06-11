package com.sgtesting.assgn5;

public class Primenumberwhile {

	public static void main(String[] args) {
		int a=10;
		boolean x=false;
		int n=2;
		while(n<=a/2)
		{
			
			if(a%n==0)
			{
				x=true;
				break;
			}
			n=n+1;
		}
		if (!x)
		{
			System.out.println(a+"is a prime");
		}
		else
		{
			System.out.println(a+"is not a prime");
		}

	}

}
