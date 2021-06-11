package com.sgtesting.assgn2;

public class Sumdivisible4 {

	public static void main(String[] args) {
		int i=1,sum=0;
		while(i<=50)
		{
			if(i%4==0)
			{
				sum=sum+i;
			}
			i=i+1;
		}
		System.out.println(sum);
	}

}
