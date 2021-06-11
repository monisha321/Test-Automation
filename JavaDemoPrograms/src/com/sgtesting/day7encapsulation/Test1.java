package com.sgtesting.day7encapsulation;

public class Test1 {
int age;
	static
	{
		System.out.println("static block");
	}
	private Test1()
	{
		System.out.println("Privateconstructor");
		age=29;
		System.out.println(age);
	}
	
	public static int sum()
	{
		System.out.println("static method return");
		
		Test1 obj=new Test1();
		
		int b=40;
		obj.age=19;
		System.out.println(obj.age);
		int c=b+obj.age;
		return c;	
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("main");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		sum();
		int a=Test1.sum();
		int b=sum();
		System.out.println(a+" "+b);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		Test1.sum();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		Test1 obj=new Test1();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		obj.age=20;
		System.out.println(obj.age);
		

	}

}
