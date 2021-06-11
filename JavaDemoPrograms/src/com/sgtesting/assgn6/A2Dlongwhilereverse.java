package com.sgtesting.assgn6;

public class A2Dlongwhilereverse {

	public static void main(String[] args) {
		long a[][]= {{1,2},{3,4},{5,6}};
		int k=(a.length-1);
		while(k>=0)
		{
			int i=(a[k].length-1);   
			while(i>=0)
			{
				System.out.print(a[k][i]+" ");
				i=i-1;
			}
			System.out.println();
			k=k-1;
		}

	}

}
