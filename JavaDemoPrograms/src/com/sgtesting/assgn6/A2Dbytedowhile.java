package com.sgtesting.assgn6;

public class A2Dbytedowhile {

	public static void main(String[] args) {
		byte a[][]= {{1,2},{3,4},{5,6}};
		int k=0;
		do
		{
			int i=0;  
			do
			{
				System.out.print(a[k][i]+" ");
				i=i+1;
			}while(i<a[k].length);
			System.out.println();
			k=k+1;
		}while(k<a.length);

	}

}
