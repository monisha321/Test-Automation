package com.sgtesting.assgn14;
class Animal1
{
	Animal1(String name)
	{
		System.out.println("name of animal is "+name);
	}
	Animal1(int lifespan)
	{
		System.out.println("lifespan of the animal is "+lifespan);
	}
	Animal1(String type,String diet)
	{
		System.out.println("diet of the animal is "+diet);
		System.out.println("the type of animal is "+type);
	}
}
class Animal2 extends Animal1
{
	Animal2(String name)
	{
		super(name);
	}
	Animal2(int lifespan)
	{
		super(lifespan);
	}
	Animal2(String type,String diet)
	{
		super(diet,type);
	}
	void display2()//this method is independent and is for animal2 only
	{
		String color="white";
		String breed="GR";
		System.out.println("the color of dog is "+color+ " and the breed is "+breed);
	}
}
class Animal3 extends Animal1
{
	Animal3(String name)
	{
		super(name);
	}
	Animal3(int lifespan)
	{
		super(lifespan);
	}
	Animal3(String type,String diet)
	{
		super(diet,type);
	}
	void display3()
	{
		String color="black";
		System.out.println("the color of cat is "+color);
	}
}
public class HierInhsuperConstructoroverloading {

	public static void main(String[] args) {
		Animal3 obj=new Animal3("cat");
		Animal3 obj2=new Animal3(20);
		Animal3 obj3=new Animal3("domestic","omnivorous");
		obj.display3();
		System.out.println("++++++++++++++++++++++++");
		Animal2 obj1=new Animal2("dog");
		Animal3 obj4=new Animal3(10);
		Animal3 obj5=new Animal3("domestic","omnivorous");
		obj1.display2();
		
	}

}
