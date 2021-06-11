package com.sgtesting.assgn2;

public class Sumdivisible4Do {

	public static void main(String[] args) {
		int i=1,sum=0;
		do
		{
			if(i%4==0) {
				sum=sum+i;
			}
			i=i+1;
		}while(i<=10);
		System.out.println(sum);

	}

}
