package com.sgtesting.assgn5;

public class Sumofdigitsdowhile {

	public static void main(String[] args) {
		int n=6789;
		int sum=0;
		do
		{
			sum=sum+(n%10);
			n=n/10;
		}while(n!=0);
		System.out.println(sum);

	}

}
