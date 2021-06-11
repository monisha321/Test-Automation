package com.sgtesting.assgn14;
class Total
{
	int res;
	void display(int x,int y,int z)
	{
		res=(x+y+z);
		System.out.println("the sum total is "+res);
	}
}
class Total1 extends Total
{
	int res1;
	void display(int x,int y)
	{
		res1=(x+y);
		System.out.println("the sum total is "+res1);
	}
}
class Avg extends Total1
{
	void avg()
	{
		int avg=(res+res1)/2;
		System.out.println("the average value is "+avg);
	}
}
public class MultiInh {//

	public static void main(String[] args) {
		Avg obj=new Avg();
		obj.display(10, 20);
		obj.display(40, 30, 50);
		obj.avg();
	}

}
