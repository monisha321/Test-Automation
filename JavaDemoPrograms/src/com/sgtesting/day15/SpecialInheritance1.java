package com.sgtesting.day15;
class Person//super class
{
	String name;
	int age;
	Person(String Fn,int age)//super class parameterised construtor
	{
		name=Fn;
		this.age=age;
	}
	void display()
	{
		System.out.println("firstname is "+name);
		System.out.println("age is "+this.age);
	}
}
class Humannew1 extends Person//sub class with parameterised constructor
{
	Humannew1(int Age,String Firstn)//same number of parameters as tat in super class constructors
	{
		super(Firstn,Age);//sub class must address the super class's parameterised constructor
	}
}
public class SpecialInheritance1 {//how to execute super class parametrised constructor based on sub class object(ans: a parameterised constructor must be created in sub class also to call super class's parametrised constructor)

	public static void main(String[] args) {
		Humannew1 obj=new Humannew1(12,"rahul");
		obj.display();
		
	}

}
