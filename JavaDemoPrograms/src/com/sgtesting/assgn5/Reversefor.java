package com.sgtesting.assgn5;

public class Reversefor {

	public static void main(String[] args) {
		
		int rev=0;
		for (int n=6789;n!=0;n/=10)
		{
			int digit=n%10;
			rev=rev*10+digit;
			
		}
		System.out.println(rev);

	}

}
