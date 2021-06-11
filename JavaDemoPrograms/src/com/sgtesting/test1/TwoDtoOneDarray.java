package com.sgtesting.test1;

public class TwoDtoOneDarray {

	public static void main(String[] args) {
		int a[][]= {{1,2},{3,4}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		int l=(a.length+a.length);//important step
		int b[]=new int[l];
		int k=0;
		for(int p=0;p<a.length;p++)
		{
			for(int q=0;q<a[p].length;q++)
			{
				b[k]=a[p][q];
				System.out.println(b[k]+" ");
				k=k+1;
			}
		}
	}

}
