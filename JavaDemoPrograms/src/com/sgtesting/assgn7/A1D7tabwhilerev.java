package com.sgtesting.assgn7;

public class A1D7tabwhilerev {

	public static void main(String[] args) {
		int s=10;
		System.out.println("size of array is :"+s);
		System.out.println();
		
		int i=1;
		while(i<=s)
		{
			System.out.println(7+"*"+i+"="+(7*i));
			i=i+1;
		}
		System.out.println();

		int a[]=new int[s];
		int k=0;
		int j=1;
		while(j<=s)
		{
			a[k]=(7*j);
			k=k+1;
			j=j+1;
		}

		int z=(a.length-1);
		while(z>=0)
		{
			System.out.println(a[z]);
			z=z-1;
		}

	}

}
