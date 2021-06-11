package com.sgtesting.assgn7;

public class A1D8tabforrev {

	public static void main(String[] args) {
		int s=10;
		System.out.println("size of array is :"+s);
		System.out.println();
		
		for(int i=1;i<=s;i++)
		{
			System.out.println(8+"*"+i+"="+(8*i));
		}
		System.out.println();

		int a[]=new int[s];
		int k=0;
		for(int j=s;j>=1;j--)
		{
			a[k]=(8*j);
			System.out.println(a[k]);//to see the reverse entry of elements
			k=k+1;
		}
		System.out.println();

		for(int z=(a.length-1);z>=0;z--)
		{
			System.out.println(a[z]);
		}

	}

}
