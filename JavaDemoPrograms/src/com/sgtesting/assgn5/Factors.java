package com.sgtesting.assgn5;

public class Factors {

	public static void main(String[] args) {
		int x=12;
		for(int n=1;n<=x;n++)
		{
			if(x%n==0)
			{
				System.out.println(n+"and"+(-n)+"are factors");
			}
		}

	}

}
