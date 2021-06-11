package com.sgtesting.assgn3;

public class Pattern8While {

	public static void main(String[] args) {
		int i=5,a=5;
		while(i>=1)
		{
			int k=i;
			while(k>=1)
			{
				System.out.print(a+" ");
				k=k-1;
			}
			System.out.println();
			a=a-1;
			i=i-1;
		}
	}
}
