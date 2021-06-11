package com.sgtesting.day7encapsulation;

public class Privateconstructor 
{
	static int price;
	int age;
	
	static
	{
		System.out.println("static block");
		Privateconstructor obj= new Privateconstructor();
		price=200;
		obj.age=60;
		System.out.println(obj.age);
	}
	private Privateconstructor()
	{
		System.out.println("Privateconstructor");
		age=29;
		System.out.println(age);
	}

	
	public static void main(String[] args) 
	{
		Privateconstructor obj=new Privateconstructor();
		obj.age=20;
		System.out.println(obj.age);

		Privateconstructor obj1=new Privateconstructor();
		obj1.age=80;
		System.out.println(obj1.age);
		

		//static block runs only once i.e., for the first time when the class is called
	}

}
