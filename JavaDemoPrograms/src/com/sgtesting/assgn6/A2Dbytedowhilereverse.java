package com.sgtesting.assgn6;

public class A2Dbytedowhilereverse {

	public static void main(String[] args) {
		byte a[][]= {{1,2},{3,4},{5,6}};
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
