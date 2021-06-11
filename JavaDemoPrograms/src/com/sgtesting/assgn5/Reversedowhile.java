package com.sgtesting.assgn5;

public class Reversedowhile {

	public static void main(String[] args) {
		int n=6789;
		int rev=0;
		do
		{
			int digit=n%10;
			rev=rev*10+digit;
			n/=10;
		}while(n!=0);
		System.out.println(rev);

	}

}
