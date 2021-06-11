package com.sgtesting.assgn3;

public class Pattern8Dowhile {

	public static void main(String[] args) {
/*5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 */
		int i=5,a=5;
		do
		{
			int k=i;
			do
			{
				System.out.print(a+" ");
				k=k-1;
			}while(k>=1);
				a=a-1;
				i=i-1;
				System.out.println();
		}while(i>=1);

	}

}
