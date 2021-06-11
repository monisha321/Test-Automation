package com.sgtesting.day5;

public class Array2Ddemo {

	public static void main(String[] args) {
		int a[][]=new int[2][3];
		a[0][1]=100;
		a[0][0]=200;
		a[0][2]=300;
		a[1][0]=400;
		a[1][1]=500;
		a[1][2]=600;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			System.out.println();
		}

	}

}
