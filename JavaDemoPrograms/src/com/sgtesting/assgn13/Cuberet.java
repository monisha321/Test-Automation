package com.sgtesting.assgn13;
class Cube
{
	static int display()
	{
		int x=10;
		System.out.println("size of array is "+x);
		return x;
	}
	static int[] arr()
	{
		int k=0;
		int a[]=new int [Cube.display()];//if it was normal method then ,just display()
		for(int p=1;p<=10;p++)
		{
			a[k]=(p*p*p);
			System.out.println(a[k]);
			k=k+1;

		}
		return a;

	}
}
public class Cuberet {

	public static void main(String[] args) {
		
		int b[]=Cube.arr();//no object creation
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
