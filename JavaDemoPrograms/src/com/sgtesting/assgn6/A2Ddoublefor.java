package com.sgtesting.assgn6;

public class A2Ddoublefor {

	public static void main(String[] args) {
		double a[][]= {{23,45,56},{67,87,78}};
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
