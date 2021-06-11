package com.sgtesting.day5;

public class Array1Ddowhilereverse {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int i=(a.length-1);
		do
		{
			System.out.print(a[i]+" ");
			i=i-1;
		}while(i>=0);
		System.out.println();
	}

}
