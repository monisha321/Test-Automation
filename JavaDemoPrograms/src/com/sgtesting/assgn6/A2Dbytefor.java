package com.sgtesting.assgn6;

public class A2Dbytefor {

	public static void main(String[] args) {
		byte a[][]= {{1,2},{3,4},{5,6}};
		for (int k=0;k<a.length;k++)
		{
			for(int i=0;i<a[k].length;i++)
			{
				System.out.print(a[k][i]+" ");
			}
			System.out.println();
		}

	}

}
