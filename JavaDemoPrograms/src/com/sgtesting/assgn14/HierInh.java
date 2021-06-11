package com.sgtesting.assgn14;
class Animal
{
	void display1()
	{
		String type="domestic";
		System.out.println("the type of animals mentioned here are "+type);
	}
}
class Dog extends Animal
{
	void display2()
	{
		String color="white";
		String breed="GR";
		System.out.println("the color of dog is "+color+ " and the breed is "+breed);
	}
}
class Cat extends Animal
{
	void display3()
	{
		String color="black";
		System.out.println("the color of cat is "+color);
	}
}
public class HierInh {

	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.display1();
		obj.display3();
		System.out.println("++++++++++++++++++++++++++++++");
		Dog obj1=new Dog();
		obj1.display1();
		obj1.display2();
	}

}
