package com.sgtesting.day16;
class Maths
{
	void add(int x,int y)
	{
		System.out.println("add "+(x+y));
	}
	void sub(int x,int y)
	{
		System.out.println("sub "+(x-y));
	}
	void div(int x,int y)
	{
		try//handles run time errors due to invalid data input
		{
			System.out.println("div "+(x/y));
		}catch(ArithmeticException e)
		{
		e.printStackTrace();
		}
	}
	void mul(int x,int y)
	{
		System.out.println("mul "+(x*y));
	}
	void mod(int x,int y)
	{
		System.out.println("mod "+(x%y));
	}
	void Even(int x)
	{
		if(x%2==0)
		{
		System.out.println("even ");
		}
	}
	void odd(int x)
	{
		if(x%2==1)
		{
		System.out.println("odd ");
		}
	}
	void positive(int x)
	{
		if(x>=0)
		{
		System.out.println("positive ");
		}
	}
}
public class AfterExceptionHandling {

	public static void main(String[] args) {
		Maths obj=new Maths();
		obj.add(10, 3);
		obj.div(10,0);
		obj.Even(10);
		obj.mul(2, 3);
		obj.mod(3, 5);
		obj.odd(4);
		obj.positive(12);

	}

}
