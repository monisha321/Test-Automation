package com.sgtesting.assgn6;

public class A2Dlongdowhile {

	public static void main(String[] args) {
		long a[][]= {{100,200},{300,400},{500,600}};
		int j=0;
		do
		{
			int i=0;  
			do
			{
				System.out.print(a[j][i]+" ");
				i=i+1;
			}while(i<a[j].length);
			System.out.println();
			j=j+1;
		}while(j<a.length);

	}

}
