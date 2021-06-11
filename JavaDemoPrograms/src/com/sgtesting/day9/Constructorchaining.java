package com.sgtesting.day9;
class Person1
{
	Person1 (String firstname)
	{
		this("rpc layout","bangalore");//constructor call must be the first statement in the constructor
		//there cant b more thn 1 'this'in a single constructor - shows error
		System.out.println("firstname is :"+firstname);
	}
	Person1 (int age)
	{
		this();//here no args constructor 'Person1()' is called
		System.out.println("age of person is :"+age);
	}
	Person1(String address,String city)
	{
		//this(12);
		System.out.println("address "+address+" and city"+city);
	}
	Person1()
	{
		this("sachin");
		System.out.println("address");
	}
}
public class Constructorchaining {//(constructor overloading + this )

	public static void main(String[] args) {
		Person1 obj=new Person1("Raj");

	}

}
