package com.sgtesting.assgn11;


class Array//The important rule to know is that when adding and subtracting matrices, first make sure the matrices have the same dimensions.

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

		System.out.println();
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

		System.out.println();
	}*/
	void dispalyelements3(int a[][],int b[][])//method name need not be equal to class name
	{
		int z[][]=new int [a.length][a[0].length];
		if ((a.length==b.length)&&(a[0].length==b[0].length))
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[0].length;j++)
				{

					z[i][j]=a[i][j]+b[i][j];
					System.out.print(z[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("addition cant be performed");
		}


	}

}
public class MethodArrAdd {//method without return

	public static void main(String[] args) {

		Array o=new Array();
		int a[][]= {{10,20},{30,40}};
		int b[][]= {{10,20},{30,40}};
		//o.displayelements(a);
		//o.displayelements1(b);
		o.dispalyelements3(a,b);
		//int c[][]=o.dispalyelements3(a, b);----shows error becoz void method cant return value to main method
	}

}
