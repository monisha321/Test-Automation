package com.sgtesting.assgn7;

public class A1D7tabforrev {

	public static void main(String[] args) {
		int s=10;
		System.out.println("size of array is :"+s);
		System.out.println();
		
		for(int i=1;i<=s;i++)
		{
			System.out.println(7+"*"+i+"="+(7*i));
		}
		System.out.println();

		int a[]=new int[s];
		int k=0;
		for(int j=1;j<=s;j++)
		{
			a[k]=(7*j);
			k=k+1;
		}

		for(int z=(a.length-1);z>=0;z--)
		{
			System.out.println(a[z]);
		}
	}

}
