package com.sgtesting.day9;
class Array
{
	void displayelements(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		//return ;
	}
}
public class MethodArray {   //entering array elements through method

	public static void main(String[] args) {
		Array o=new Array();
		int a[]= {10,20,30,40};
		o.displayelements(a);
	}

}
