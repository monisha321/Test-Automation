package com.sgtesting.assgn3;

public class Pattern6Dowhile {

	public static void main(String[] args) {
/*1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5 */
		int i=1,a=1;
		do
		{
			int k=1;
			do
			{
				System.out.print(a+" ");
				k=k+1;
			}while(k<=5);
			System.out.println();
			a=a+1;
			i=i+1;
		}while(i<=5);

	}

}
