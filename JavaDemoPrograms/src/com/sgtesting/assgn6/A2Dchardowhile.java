package com.sgtesting.assgn6;

public class A2Dchardowhile {

	public static void main(String[] args) {
		char a[][]= {{'g','t','y'},{'e','g','g'}};
		int j=0;
		do
		{
			int i=0;  
			do
			{
				System.out.print(a[j][i]+" ");
				i=i+1;
			}while(i<a[j].length);
			System.out.println();
			j=j+1;
		}while(j<a.length);

	}

}
