package com.sgtesting.assgn7;

public class A1Dodddowhilereverse {

	public static void main(String[] args) {
		int sum=0;
		int i=71;
		do
		{
			if(i%2!=0)
			{
				System.out.println(i);
				sum=sum +1;
			}
			i=i+1;
		}while(i<=91);
		System.out.println("size of array is "+sum);

		int a[]=new int[sum];
		int k=0;
		int j=71;
		do
		{
			if(j%2!=0)
			{
				a[k]=j;
				k=k+1;
			}
			j=j+1;
		}while(j<=91);

		int z=(a.length-1);
		do
		{
			System.out.println(a[z]);
			z=z-1;
		}while(z>=0);

	}

}
