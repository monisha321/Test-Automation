package com.sgtesting.assgn3;

public class Pattern4While {

	public static void main(String[] args) {
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				int a=i;
				while(a<=i)
				{
					System.out.print(a+" ");
					a=a+1;
				}
				k=k+1;
			}
			System.out.println();
			i=i+1;
		}

	}

}
