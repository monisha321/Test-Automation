package com.sgtesting.day9;
class Demo//all constructors in overloading must have same name as that of class name
{
	Demo(String s)
	{
		System.out.println("value of s: "+s);
	}
	Demo(int x)
	{
		System.out.println("value of x is: "+x);
	}
	Demo(int s,int x,String a)
	{
		System.out.println(s+a+x);//(s+x+a)= adds s and x values
	}
}
public class Constructoroverloading {//same class with many constructors having different datatypes

	public static void main(String[] args) {//each constructor must have different objects cretaed for it
		Demo obj=new Demo(125);
		Demo obj1=new Demo("bangalore");
		Demo obj2=new Demo(34,12,"java pgm");
	}

}
