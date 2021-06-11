package com.sgtesting.assgn13;
class Even
{
	static int display()
	{
		int x=0;
		for(int i=40;i<=60;i++)
		{
			if(i%2==0)
			{
				x=x+1;
			}
		}
		System.out.println("size of array is "+x);
		return x;
	}
	static int[] arr()
	{
		int k=0;
		int a[]=new int [Even.display()];
		for(int p=40;p<=60;p++)
		{
			if (p%2==0)
			{
				a[k]=p;
				//System.out.println(a[k]);
				k=k+1;
			}
		}
		return a;

	}
}
public class Evenarrayret {

	public static void main(String[] args) {
		//Even.display();
		//Even.arr();
		int a[]=Even.arr();//----write this step as sir suggested to use this instead of directly printing in the static method
		for(int q=0;q<a.length;q++)
		{
			System.out.print(a[q]+" ");
		}
	}

}
