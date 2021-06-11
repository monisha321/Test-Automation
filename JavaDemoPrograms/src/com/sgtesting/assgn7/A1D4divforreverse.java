package com.sgtesting.assgn7;

public class A1D4divforreverse {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=50;i++)
		{
			if(i%4==0)
			{
				System.out.println(i);
				sum=sum +1;
			}
		}
		System.out.println("size of array is "+sum);

		int a[]=new int[sum];
		int k=0;
		for(int j=1;j<=50;j++)
		{
			if(j%4==0)
			{
				a[k]=j;
				k=k+1;
			}
		}

		for(int z=(a.length-1);z>=0;z--)
		{
			System.out.println(a[z]);
		}

	}

}
