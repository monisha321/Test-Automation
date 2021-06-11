package com.sgtesting.assgn3;

public class Pattern4Dowhile {

	public static void main(String[] args) {
/*1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 */
		int i=1;
		do
		{
			int k=1;
			do
			{
				int a=i;
				do
				{
					System.out.print(a+" ");
					a=a+1;
				}while(a<=i);
				k=k+1;
			}while(k<=i);
			System.out.println();
			i=i+1;
		}while(i<=5);

	}

}
