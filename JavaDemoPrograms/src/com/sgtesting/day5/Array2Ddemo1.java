package com.sgtesting.day5;

public class Array2Ddemo1 {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i=(a.length-1);i>=0;i--)
		{
			for(int j=(a[i].length-1);j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
