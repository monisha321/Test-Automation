package com.sgtesting.day15;
class Math
{
	void addition(int x,int y)
	{
		System.out.println("addition :"+(x+y));
	}
}
class Maths5 extends Math
{
	void sub(int a,int b)
	{
		System.out.println("sub result is "+(a-b));
	}
}
class Maths6 extends Math
{
	void multiply(int x,int y)
	{
		System.out.println("multipl res is "+(x*y));
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Maths5 obj= new Maths5();
		obj.addition(10, 5);
		obj.sub(20, 8);
		
		Maths6 obj1=new Maths6();
		obj1.addition(30, 40);
		obj1.multiply(30, 30);
		

	}

}
