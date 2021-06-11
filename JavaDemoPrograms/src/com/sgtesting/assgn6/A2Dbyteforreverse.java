package com.sgtesting.assgn6;

public class A2Dbyteforreverse {

	public static void main(String[] args) {
		byte a[][]= {{1,2},{3,4},{5,6}};
		for (int k=(a.length-1);k>=0;k--)
		{
			for(int i=(a[k].length-1);i>=0;i--)
			{
				System.out.print(a[k][i]+" ");
			}
			System.out.println();
		}

	}

}
