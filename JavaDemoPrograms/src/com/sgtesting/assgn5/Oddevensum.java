package com.sgtesting.assgn5;

public class Oddevensum {

	public static void main(String[] args) {
		int n,temp=0,temp1=0;
		for(n=1;n<=100;n++)
		{
			if(n%2==0)
			{
				temp=temp+n;
			}
			
			else
			{
				temp1=temp1+n;
				
			}
		}
		System.out.println(temp+" is sum of even numbers");
		System.out.println(temp1+" is sum of odd numbers");
	}

}
