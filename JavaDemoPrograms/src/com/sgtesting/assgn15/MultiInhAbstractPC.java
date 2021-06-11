package com.sgtesting.assgn15;


abstract class Person
{
	abstract void id(int id);
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println("name of the first person is "+name);
		System.out.println("age of the first person is "+age);
	}
}
abstract class Person1 extends Person
{
	String name1;
	int age1;
	Person1(String name,int age,String n,int a)
	{
		super(name,age);
		this.name1=n;
		this.age1=a;
		System.out.println("name of secong  person"+n);
		System.out.println("age of second person" +a);
	}


	void id(int id)
	{
		System.out.println("id of first person is "+id);
	}

	
}
class College extends Person1
{
	String cname;
	College(String name,int age,String n,int a)
	{
		super(name,age,n,a);
	}

	void dispaly3(String name)
	{
		this.name=name;
		System.out.println("name of the college is "+name);
	}
}
public class MultiInhAbstractPC {

	public static void main(String[] args) {
		College obj =new College("rahul",30,"m",12);
		obj.dispaly3("RVCE");
		obj.display();
		//obj.display1("santhosh", 39);
		obj.id(12009);

	}

}
