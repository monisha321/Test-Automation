package com.sgtesting.assgn3;

public class Pattern10Dowhile {

	public static void main(String[] args) {
		/*5 5 5 5 5 
		4 4 4 4 4 
		3 3 3 3 3 
		2 2 2 2 2 
		1 1 1 1 1 */
		
		int a=5,i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print(a+" ");
				k=k+1;
			}while(k<=5);
			System.out.println();
			a=a-1;
			i=i+1;
		}while(i<=5);

	}

}
