package com.sgtesting.assgn7;

public class A1Devenfor {

	public static void main(String[] args) {
		int s=0;
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				s=s+1;
			}
		}
		System.out.println();
		System.out.println(s+" is the size of the array");
		System.out.println();

		int a[]=new int[s];
		int k=0;
		for(int j=20;j<=40;j++)
		{
			if(j%2==0) 
			{
				a[k]=j;
				//System.out.println(a[k]);
				k=k+1;
			}
		}

		for(int z=0;z<a.length;z++)
		{
			System.out.println(a[z]);
		}
	}

}
