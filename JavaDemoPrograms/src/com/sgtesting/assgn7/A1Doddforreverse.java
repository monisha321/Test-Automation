package com.sgtesting.assgn7;

public class A1Doddforreverse {

	public static void main(String[] args) {
		int s=0;
		for(int i=71;i<=91;i++)
		{
			if(i%2!=0)
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
		for(int j=71;j<=91;j++)
		{
			if(j%2!=0) 
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
