package com.sgtesting.assgn13;
class Square
{
	static int[] display(int b)
	{
		System.out.println("size of array is "+b);

		int a[]=new int[b];
		int k=0;
		for(int j=1;j<=10;j++)
		{
			a[k]=j*j;
			k=k+1;
		}
		int s=0;
		for(int p=0;p<a.length;p++)
		{
			s=s+a[p];
		
		}
		System.out.println(s);
		return a;
	}
}
public class Squaresumret {

	public static void main(String[] args) {
		Square.display(10);
		int q[]=Square.display(10);
		for(int v=0;v<q.length;v++)
		{
			System.out.println(q[v]);
		}
	}

}
