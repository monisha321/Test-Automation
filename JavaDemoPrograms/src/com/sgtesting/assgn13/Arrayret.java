package com.sgtesting.assgn13;
class Array//static method return
{//c matrix must have all elements of a and b matrix
	static int[] arr(int a[],int b[])
	{

		int c[]=new int[(a.length+b.length)];

		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];

		}
		for(int i=0;i<b.length;i++)
		{
			c[(a.length+i)]=b[i];
		}
		return c;//only when c is returned main method can read c.
	}
}
public class Arrayret {

	public static void main(String[] args) {
		//Array.arr(a,b);
		
		//no need to create object
		
		int a[]={10,20,30,40} ;
		int b[]={5,25,15,35,45};
		
		int p[]=Array.arr(a,b);//class_name.static_method_name
		for(int q=0;q<p.length;q++)
		{
			System.out.println(p[q]);
		}
	}

}
