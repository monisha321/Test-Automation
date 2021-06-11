package com.sgtesting.day12;

class DeMo7//static block executes first nd not constructor becoz, all static members are class level nd constructor ,methods are of object level -- check o/p
{
	DeMo7()
	{
		System.out.println("constructor");
	}
	static
	{
		System.out.println("static block");
	}
}
public class Staticdemo {

	public static void main(String[] args) {
		DeMo7 obj=new DeMo7();
	}

}
