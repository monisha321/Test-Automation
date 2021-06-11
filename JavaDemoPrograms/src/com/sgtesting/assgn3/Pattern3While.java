package com.sgtesting.assgn3;

public class Pattern3While {

	public static void main(String[] args) {
		int i=1;
		while(i<=5)
		{
			int k=1,a=1;
			while(k<=i)
			{
				System.out.print(a+" ");
				k=k+1;
				a=a+1;
			}
			System.out.println();
			i=i+1;
		}

	}

}
