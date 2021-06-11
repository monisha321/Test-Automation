package com.sgtesting.assgn7;

public class A1Devenwhile {

	public static void main(String[] args) {
		int sum=0;
		int i=20;
		while(i<=40)
		{
			if(i%2==0)
			{
				System.out.println(i);
				sum=sum +1;
			}
			i=i+1;
		}
		System.out.println("size of array is "+sum);

		int a[]=new int[sum];
		int k=0;
		int j=20;
		while(j<=40)
		{
			if(j%2==0)
			{
				a[k]=j;
				k=k+1;
			}
			j=j+1;
		}

		int z=0;
		while(z<a.length)
		{
			System.out.println(a[z]);
			z=z+1;
		}

	}

}
