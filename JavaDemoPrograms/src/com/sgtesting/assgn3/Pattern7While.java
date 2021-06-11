package com.sgtesting.assgn3;

public class Pattern7While {

	public static void main(String[] args) {
		int i=5;
		while(i>=1)
		{
			int k=5;
			while(k>=i)
			{
				System.out.print("*"+" ");
				k=k-1;
			}
			System.out.println();
			i=i-1;
		}

	}

}
