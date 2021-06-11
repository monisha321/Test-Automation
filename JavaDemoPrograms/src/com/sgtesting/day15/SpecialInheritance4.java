package com.sgtesting.day15;
class Humans//super class
{
	String name;
	int age;
	Humans(String Fn,int age)//super class parameterised construtor
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
class Humannew extends Humans//sub class also has parameterised constructor
{
	String mname,lname;
	Humannew(String mname,String lname)//sub class's constructor
	{
		super("rahul",23);//sub class must address the super class's parameterised constructor
		this.mname=mname;
		this.lname=lname;
		System.out.println("middlename is "+mname);
		System.out.println("last name is "+lname);
	}
}
public class SpecialInheritance4 {//Parameterised constructor in both superclass and subclass

	public static void main(String[] args) {
		Humannew obj=new Humannew("arula","mohan");
		obj.display();
		//obj.age=12;
		//obj.name="sachin";
	}

}
