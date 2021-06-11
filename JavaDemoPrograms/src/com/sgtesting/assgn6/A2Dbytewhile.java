package com.sgtesting.assgn6;

public class A2Dbytewhile {

	public static void main(String[] args) {
		byte a[][]= {{1,2},{3,4},{5,6}};
		int k=0;// if int i=0; is placed here ,only one row will be displayed//
		while(k<a.length)
		{
			int i=0;   //placement of this argument is imp//
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
