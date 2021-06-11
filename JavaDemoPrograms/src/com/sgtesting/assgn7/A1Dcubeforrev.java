package com.sgtesting.assgn7;

import java.util.Scanner;

public class A1Dcubeforrev {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array");
		int b=s.nextInt();
		for(int i=1;i<=b;i++)
		{
			System.out.println(i*i*i);
		}
		System.out.println();

		int a[]=new int[b];
		int k=0;
		for(int j=1;j<=b;j++)
		{
			a[k]=j*j*j;
			k=k+1;
		}

		for(int z=(a.length-1);z>=0;z--)
		{
			System.out.println(a[z]);
		}
		s.close();

	}

}
