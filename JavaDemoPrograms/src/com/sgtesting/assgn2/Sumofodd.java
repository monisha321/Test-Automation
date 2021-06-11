package com.sgtesting.assgn2;

public class Sumofodd {

	public static void main(String[] args) {
		int i=1,sum=0;
		while(i<=10)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
			i=i+1;
		}
		System.out.println(sum);

	}

}
