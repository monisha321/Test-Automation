package com.sgtesting.assgn15;
abstract class College1
{
	abstract void showname(String name);
	abstract void showcity(String city);
}
abstract class college2 extends College1
{
	void showname(String name)
	{
		System.out.println("college name is "+name);
	}
	void method1() 
	{
		System.out.println("method1 of college2");
	}
}
class college3 extends college2
{
	void showcity(String city)
	{
		System.out.println("city name is "+city);
	}
	void method2()
	{
		System.out.println("method2 of college3");
	}
}
public class MultiInhAbstract1 {//practice example done in class

	public static void main(String[] args) {
		college2 obj=new college3();
		obj.method1();
		obj.showcity("mysore");
		obj.showname("sjr");
		System.out.println("++++++++++++++++++++++++");
		
		
	}

}
