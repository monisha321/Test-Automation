package com.sgtesting.assgn6;

public class A2Dchardowhilereverse {

	public static void main(String[] args) {
		char a[][]= {{'l','d'},{'s','4'},{'3','7'}};
		int k=(a.length-1);
		do
		{
			int i=(a[k].length-1);   
			do
			{
				System.out.print(a[k][i]+" ");
				i=i-1;
			}while(i>=0);
			System.out.println();
			k=k-1;
		}while(k>=0);

	}

}
