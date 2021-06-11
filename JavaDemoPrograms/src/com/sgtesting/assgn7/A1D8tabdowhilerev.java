package com.sgtesting.assgn7;

public class A1D8tabdowhilerev {

	public static void main(String[] args) {
		int s=10;
		System.out.println("size of array is :"+s);
		System.out.println();
		
		int i=1;
		do
		{
			System.out.println(8+"*"+i+"="+(8*i));
			i=i+1;
		}while(i<=s);
		System.out.println();

		int a[]=new int[s];
		int k=0;
		int j=s;
		do
		{
			a[k]=(8*j);
			System.out.println(a[k]);
			k=k+1;
			j=j-1;
		}while(j>=1);
		System.out.println();

		int z=(a.length-1);
		do
		{
			System.out.println(a[z]);
			z=z-1;
		}while(z>=0);

	}

}
