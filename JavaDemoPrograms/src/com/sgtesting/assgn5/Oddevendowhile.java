package com.sgtesting.assgn5;

public class Oddevendowhile {

	public static void main(String[] args) {
		int n=1,temp=0,temp1=0;
		do
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
		}while(n<=100);
		System.out.println(temp+" is sum of even numbers");
		System.out.println(temp1+" is sum of odd numbers");

	}

}
