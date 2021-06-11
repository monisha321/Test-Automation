package com.sgtesting.assgn3;

public class Pattern3Dowhile {

	public static void main(String[] args) {
/*1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 */
		int i=1;
		do
		{
			int k=1,a=1;
			do
			{
				System.out.print(a+" ");
				k=k+1;
				a=a+1;
			}while(k<=i);
			System.out.println();
			i=i+1;
		}while(i<=5);

	}

}
