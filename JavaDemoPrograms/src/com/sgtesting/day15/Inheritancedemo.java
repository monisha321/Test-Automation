package com.sgtesting.day15;
class Maths1//object for parent class should not be created else it will b similar to encapsulation
{
	void addition(int x,int y)
	{
		System.out.println("addition :"+(x+y));
	}
}
class Maths2 extends Maths1//child class
{
	void sub(int a,int b)
	{
		System.out.println("sub result is "+(a-b));
	}
}
public class Inheritancedemo {//simple inheritance

	public static void main(String[] args) {
		Maths2 obj=new Maths2();//object is created for child class through wic even parent class can be called.
		obj.addition(10, 20);
		obj.sub(10, 5);

	}

}
