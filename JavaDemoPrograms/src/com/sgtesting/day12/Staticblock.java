package com.sgtesting.day12;
class StaticTest
{
	static String firstname;//static variables
	static int age;
	
	StaticTest()
	{
		System.out.println("++++++++++++++");
	}
	
	static//static block executes first and later the class and main method executes thrfr ,static block provides o/p first and later main o/p--check the result.
	{
		firstname="santhosh";
		age=18;
		showFn();
	}

	static void showFn()
	{
		System.out.println("firstname is "+firstname);
	}
	static void showAge()
	{
		System.out.println("here age is "+age);
	}
}
public class Staticblock {//static block need not be called... it executes by itself

	public static void main(String[] args) {
		StaticTest obj=new StaticTest();//without object, constructor cant be executed
		
		//StaticTest.age=17;
		//System.out.println("age is "+StaticTest.age);
		
		StaticTest.showAge();
		//StaticTest.showFn();
	}

}
