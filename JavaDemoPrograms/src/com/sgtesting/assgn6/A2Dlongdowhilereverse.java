package com.sgtesting.assgn6;

public class A2Dlongdowhilereverse {

	public static void main(String[] args) {
		long a[][]= {{16,62},{38,54},{56,76}};
		int k=(a.length-1);
		do
		{
			int i=(a[k].length-1);   
			do
			{
				System.out.print(a[k][i]+" ");
				i=i-1;
			}while(i>=0);
			System.out.println();
			k=k-1;
		}while(k>=0);

	}

}
