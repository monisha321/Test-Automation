package com.sgtesting.assgn3;

public class Pattern2While {

	public static void main(String[] args) {
		int i=1;
		while(i<=4)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print("#"+" ");
				k=k+1;
			}
			System.out.println();
			i=i+1;
		}


	}

}
