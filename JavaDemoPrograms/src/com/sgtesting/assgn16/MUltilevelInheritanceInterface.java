package com.sgtesting.assgn16;
interface AAA
{
	void add(int x,int y);
}
interface BBB extends AAA
{
	void sub(int x,int y);
}
interface CCC extends BBB
{
	void div(int x,int y);
}
class Math implements CCC
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
}
public class MUltilevelInheritanceInterface {

	public static void main(String[] args) {
		Math obj=new Math();
		obj.add(10, 40);
		obj.div(40, 6);
		obj.sub(4, 3);

	}

}
