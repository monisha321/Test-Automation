package com.sgtesting.assgn6;

public class A2Ddoublewhile {

	public static void main(String[] args) {
		double a[][]= {{1,2},{3,4},{5,6}};
		int k=0;
		while(k<a.length)
		{
			int i=0;  
			while(i<a[k].length)
			{
				System.out.print(a[k][i]+" ");
				i=i+1;
			}
			System.out.println();
			k=k+1;
		}

	}

}
