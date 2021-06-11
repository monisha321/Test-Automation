package com.sgtesting.assgn3;

public class Pattern5Dowhile {

	public static void main(String[] args) {
/*1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15*/
		int i=1,a=1;
		do
		{
			int k=1;
			do
			{
				System.out.print(a+++" ");
				k=k+1;
			}while(k<=i);
			System.out.println();
			i=i+1;
		}while(i<=5);

	}

}
