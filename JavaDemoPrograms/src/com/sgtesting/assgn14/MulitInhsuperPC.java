package com.sgtesting.assgn14;
class Total2
{
	int res,a,b,c;
	Total2(int x,int y,int c)
	{
		a=x;
		b=y;
		this.c=c;
	}
	void display()
	{
		res=(a+b+c);
		System.out.println("the sum total1 is "+res);
	}
}
class Total4 extends Total2
{
	int res1;
	Total4(int x,int y,int b)
	{
		super(x,y,b);
	}
	void display1(int x,int y)
	{
		res1=(x+y);
		System.out.println("the sum total2 is "+res1);
	}
}
class Avg1 extends Total4
{
	Avg1(int x,int y,int b)
	{
		super(x,y,b);
	}
	void avg()
	{
		int avg=(res+res1)/2;
		System.out.println("the average value is "+avg);
	}
}
public class MulitInhsuperPC {

	public static void main(String[] args) {
		Avg1 obj=new Avg1(10,20,30);
		obj.display();
		obj.display1(40,40);
		obj.avg();
	}

}
