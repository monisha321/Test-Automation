package com.sgtesting.assgn7;

public class A1D15tabforrev {

	public static void main(String[] args) {
		int s=10;
		System.out.println("size of array is :"+s);
		System.out.println();
		
		for(int i=1;i<=s;i++)
		{
			System.out.println(15+"*"+i+"="+(15*i));
			
		}
		System.out.println();

		int a[]=new int[s];
		int k=0;
		for(int j=s;j>=1;j--)
		{
			a[k]=(15*j);
			System.out.println(a[k]);
			k=k+1;
			
		}
		System.out.println();

		for(int z=(a.length-1);z>=0;z--)
		{
			System.out.println(a[z]);
			
		}

	}

}
