package com.sgtesting.assgn5;

public class Factorswhile {

	public static void main(String[] args) {
		int x=86;
		int n=1;
		while(n<=x)
		{
			if(x%n==0)
			{
				System.out.println(n+"and"+(-n)+" are factors");
			}
			n=n+1;
		}

	}

}
