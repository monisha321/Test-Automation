package com.sgtesting.assgn3;

public class Pattern7Dowhile {

	public static void main(String[] args) {
/** * * * * 
* * * * 
* * * 
* * 
* */
		int i=5;
		do
		{
			int k=i;
			do
			{
				System.out.print("*"+" ");
				k=k-1;
			}while(k>=1);
			System.out.println();
			i=i-1;
		}while(i>=1);

	}

}
