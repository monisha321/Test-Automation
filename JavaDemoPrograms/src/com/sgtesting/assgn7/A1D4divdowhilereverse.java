package com.sgtesting.assgn7;

public class A1D4divdowhilereverse {

	public static void main(String[] args) {
		int sum=0;
		int i=1;
		do
		{
			if(i%4==0)
			{
				System.out.println(i);
				sum=sum +1;
			}
			i=i+1;
		}while(i<=50);
		System.out.println("size of array is "+sum);

		int a[]=new int[sum];
		int k=0;
		int j=1;
		do
		{
			if(j%4==0)
			{
				a[k]=j;
				k=k+1;
			}
			j=j+1;
		}while(j<=50);

		int z=(a.length-1);
		do
		{
			System.out.println(a[z]);
			z=z-1;
		}while(z>=0);


	}

}
