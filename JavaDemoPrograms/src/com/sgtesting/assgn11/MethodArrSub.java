package com.sgtesting.assgn11;

class Array1
{
	/*void displayelements(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	void displayelements1(int b[][])
	{
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
			System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}*/
	void dispalyelements3(int z[][],int a[][],int b[][])
	{
		if ((a.length==b.length)&&(a[0].length==b[0].length))
		{
			for(int i=0;i<z.length;i++)
			{
				for(int j=0;j<z[i].length;j++)
				{

					z[i][j]=a[i][j]-b[i][j];
					System.out.print(z[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("subtraction cant be performed");
		}

	}

}
public class MethodArrSub{

	public static void main(String[] args) {
		
		Array1 o=new Array1();
		int a[][]= {{10,20,89},{30,40,78}};
		int b[][]= {{1,2},{3,4}};
		
		//int size=2;
		//int z[][]=new int[size][size];
		int z[][]=new int[a.length][b.length];

		o.dispalyelements3(z,a,b);
	}

}

