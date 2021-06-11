package com.sgtesting.assgn14;
class Sum
{
	int res;
	void display(int x,int y,int z)
	{
		res=(x+y+z);
		System.out.println("the sum total is "+res);
	}
}
class Sum1 extends Sum
{
	int res1;
	Sum1(int x,int y,int z)
	{
		super.display(x, y, z);
	}
	void display(int x,int y,int z)
	{
		//super.display(x, y, z);
		res1=(x+y+z);
		System.out.println("the SUM1 total is "+res1);
	}
}
class Average extends Sum1
{
	Average(int x,int y,int z)
	{
		super(x,y,z);
	}
	void display()
	{
		int avg=(res+res1)/2;
		System.out.println("the average value is "+avg);
	}
}
public class MultiInhMethodOverriding {//same method name with signature

	public static void main(String[] args) {
		Average obj=new Average(10,20,30);
		obj.display(40, 40, 40);
		obj.display();
	}

}
