package com.sgtesting.day16;
class Math
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
	
		{
			System.out.println("div "+(x/y));
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
public class BeforeExceptionHandling {

	public static void main(String[] args) {
		Math obj=new Math();
		obj.add(10, 3);
		obj.div(10,0);
		obj.Even(10);

	}

}
