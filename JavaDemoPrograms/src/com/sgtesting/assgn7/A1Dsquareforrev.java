package com.sgtesting.assgn7;

public class A1Dsquareforrev {

	public static void main(String[] args) {
		int b=10;
		System.out.println("size of array is "+b);
		for(int i=1;i<=b;i++)
		{
			System.out.println(i*i);
		}
		System.out.println();

		int a[]=new int[b];
		int k=0;
		for(int j=1;j<=10;j++)
		{
			a[k]=j*j;
			k=k+1;
		}

		for(int z=(a.length-1);z>=0;z--)
		{
			System.out.println(a[z]);
		}

	}

}
