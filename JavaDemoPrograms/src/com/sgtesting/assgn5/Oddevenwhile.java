package com.sgtesting.assgn5;

public class Oddevenwhile {

	public static void main(String[] args) {
		int n=1,temp=0,temp1=0;
		while(n<=100)
		{
			if(n%2==0)
			{
				temp=temp+n;
			}
			
			else
			{
				temp1=temp1+n;
				
			}
			n=n+1;
		}
		System.out.println(temp+" is sum of even numbers");
		System.out.println(temp1+" is sum of odd numbers");

	}

}
