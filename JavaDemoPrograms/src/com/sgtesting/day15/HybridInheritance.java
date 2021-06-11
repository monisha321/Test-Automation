package com.sgtesting.day15;
class Mathss
{
	void addition(int x,int y)
	{
		System.out.println("addition :"+(x+y));
	}
}
class Math5 extends Mathss
{
	void sub(int a,int b)
	{
		System.out.println("sub result is "+(a-b));
	}
}
class Math6 extends Mathss
{
	void multiply(int x,int y)
	{
		System.out.println("multipl res is "+(x*y));
	}
}
class Maths7 extends Math6
{
	void div(int a,int b)
	{
		System.out.println("div res is "+(a/b));
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		Math5 obj=new Math5();
		obj.addition(10, 30);
		obj.sub(10, 9);
		
		Maths7 obj1=new Maths7();
		obj1.addition(30, 8);
		obj1.div(3, 2);
		obj1.multiply(4, 7);
		
	}

}
