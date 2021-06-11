package com.sgtesting.assgn3;

public class Pattern5While {

	public static void main(String[] args) {
		int i=1;int a=1;
		while(i<=5)
		{
			int k=1;
			while(k<i+1)
			{
				
				System.out.print(a++ +" ");
				k=k+1;
			}
			System.out.println();
			i=i+1;
		}
		
	}

}
