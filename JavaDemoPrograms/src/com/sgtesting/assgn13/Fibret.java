package com.sgtesting.assgn13;
class Fib//fibonacci series of first 10 numbers
{

	/*static void display()
	{
		int a=0,b=1;
		int c;
		for(int n=1;n<=8;n++)//or n=2;n<10
		{
			c=a+b;		
			a=b;
			b=c;			
		}

	}*/
	static int[] arr(int p,int q)
	{
		int k=0,b;//same variables can be used in different methods
		int a[]=new int[10];

		System.out.print(p+" "+q+" ");
		for(int m=2;m<10;m++)
		{
			b=p+q;
			a[k]=b;
			//System.out.print(a[k]+" ");
			k=k+1;
			p=q;
			q=b;
		}
		return a;
	}
}
public class Fibret {

	public static void main(String[] args) {
		//Fib.display();
		//Fib.arr(0, 1);
		int b[]=Fib.arr(0, 1);
		for(int n=0;n<(b.length-2);n++)
		{
			System.out.print(b[n]+" ");
		}
	}

}
