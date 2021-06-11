package com.sgtesting.assgn15;
abstract class Maths
{
	abstract void add(int x,int y);
	abstract void sub(int x,int y);
	abstract void div(int x,int y);
}
class Math1 extends Maths
{

	void add(int x,int y)
	{
		System.out.println("addtion res is "+(x+y));
	}
	void sub(int x,int y)
	{
		System.out.println("subtraction res is "+(x-y));
	}
	void div(int x,int y)
	{
		System.out.println("division res is"+(x/y));
	}
}
class Math2 extends Maths
{
	void div(int x,int y)
	{
		System.out.println("division res is"+(x/y));
	}
	void add(int x,int y)
	{
		System.out.println("addtion res is "+(x+y));
	}
	void sub(int x,int y)
	{
		System.out.println("subtraction res is "+(x-y));
	}
	void mul(int x,int y)
	{
		System.out.println("multiplication res is "+(x*y));
	}
}
public class HierarInhAbstract {

	public static void main(String[] args) {
		Math2 obj=new Math2();
		obj.add(10, 20);
		obj.div(50, 2);
		obj.mul(2, 3);
		obj.sub(10, 8);
		System.out.println("++++++++++++++++++++++");
		Math1 obj1=new Math1();
		obj1.add(10, 70);
		obj1.div(8, 4);
		obj1.sub(20, 5);
	}

}
