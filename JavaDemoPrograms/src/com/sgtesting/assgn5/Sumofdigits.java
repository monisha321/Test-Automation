package com.sgtesting.assgn5;

public class Sumofdigits {

	public static void main(String[] args) {
		int n=6789;
		int sum=0;
		while(n!=0)
		{
			sum=sum+(n%10);
			n=n/10;
		}
		System.out.println(sum);
	}

}
