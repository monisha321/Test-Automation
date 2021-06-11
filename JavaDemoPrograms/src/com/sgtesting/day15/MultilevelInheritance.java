package com.sgtesting.day15;
class Maths//grandparent class
{
	void addition(int x,int y)
	{
		System.out.println("addition :"+(x+y));
	}
}
class Maths3 extends Maths//parent class
{
	void sub(int a,int b)
	{
		System.out.println("sub result is "+(a-b));
	}
}
class Maths4 extends Maths3//child class
{
	void multiply(int x,int y)
	{
		System.out.println("multipl res is "+(x*y));
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Maths4 obj=new Maths4();
		obj.addition(10, 20);
		obj.multiply(3, 8);
		obj.sub(10, 3);
		
		Maths3 obj1=new Maths3();
		obj1.addition(2, 3);
		obj1.sub(12, 2);
		
		Maths obj2=new Maths();
		obj2.addition(4, 5);
		
	}

}
