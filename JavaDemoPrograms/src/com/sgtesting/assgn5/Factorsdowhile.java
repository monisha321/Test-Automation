package com.sgtesting.assgn5;

public class Factorsdowhile {

	public static void main(String[] args) {
		int x=89;
		int n=1;
		do
		{
			if(x%n==0)
			{
				System.out.println(n+"and"+(-n)+" are factors");
			}
			n=n+1;
		}while(n<=x);

	}

}
