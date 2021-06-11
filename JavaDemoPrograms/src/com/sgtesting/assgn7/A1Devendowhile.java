package com.sgtesting.assgn7;

public class A1Devendowhile {

	public static void main(String[] args) {
		int sum=0;
		int i=20;
		do
		{
			if(i%2==0)
			{
				System.out.println(i);
				sum=sum +1;
			}
			i=i+1;
		}while(i<=40);
		System.out.println("size of array is "+sum);
		
		int a[]=new int[sum];
		int k=0;
		int j=20;
		do
		{
			if(j%2==0)
			{
				a[k]=j;
				k=k+1;
			}
			j=j+1;
		}while(j<=40);
		
		int z=0;
		do
		{
			System.out.println(a[z]);
			z=z+1;
		}while(z<a.length);

	}

}
