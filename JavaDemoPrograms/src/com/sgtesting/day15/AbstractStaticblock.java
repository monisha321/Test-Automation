package com.sgtesting.day15;
abstract class Test
{
	static//static block executes only once
	{
		System.out.println("static block");
	}
}
class Test1 extends Test
{
	
}
public class AbstractStaticblock {//how to execute static block in an abstarct class

	public static void main(String[] args) {
		Test obj=new Test1();
		Test1 obj1=new Test1();
	}

}
