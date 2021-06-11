package com.sgtesting.assgn16;
interface Add
{
	void add(int x,int y);
}
interface Sub extends Add
{
	void sub(int x,int y);
}
interface Div extends Add
{
	void div(int x,int y);
}
interface Mul extends Div
{
	void mul(int x,int y);
}
class Mathh implements Mul,Sub
{
	public void add(int x,int y)
	{
		System.out.println("addition result is "+(x+y));
	}
	public void sub(int x,int y)
	{
		System.out.println("subtraction result is "+(x-y));
	}
	public void div(int x,int y)
	{
		System.out.println("division result is "+(x/y));
	}
	public void mul(int x,int y)
	{
		System.out.println("multiplication result is "+(x*y));
	}
}
public class HybridInheritanceInterface {

	public static void main(String[] args) {
		Mathh obj=new Mathh();
		obj.add(12, 35);
		obj.div(34, 8);
		obj.sub(34, 7);
		obj.mul(4, 5);
		
	}

}
