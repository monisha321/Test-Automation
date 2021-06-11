package com.sgtesting.assgn7;

public class A1Dbubblesort {

	public static void main(String[] args) {
		int temp;
		int a[]= {2,1,5,3,4};
		for(int k=0;k<(a.length-1);k++)
		{
			if (a[k]>a[k+1])
			{
				temp =a[k];
				a[k]=a[k+1];
				a[k+1]=temp;
			}
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
