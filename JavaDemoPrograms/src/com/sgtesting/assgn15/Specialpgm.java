package com.sgtesting.assgn15;

abstract class Company1
{
	abstract void name(String name);
	abstract void location(String loc);
	void depts(String dept[])
	{
		System.out.println("departments of the company ");
		for(int i=0;i<dept.length;i++)
		{
			System.out.println(dept[i]);
		}
	}
}
abstract class Employee2 extends Company1
{
	abstract void Ename(String ename);
	void name(String name)
	{
		System.out.println("Name of the company is "+name);
	}
	void location(String loc)
	{
		System.out.println("branch location is "+loc);
	}
	void id (int id)
	{
		System.out.println("id of the employee is "+id);
	}
}
class Place1 extends Employee2
{
	Place1(String name)
	{
		super.name(name);
	}
	void Ename(String ename)
	{
		System.out.println("name of the employee is "+ename);
	}
	void name(String name)
	{
		System.out.println("place of the employee is "+name);
	}

}
public class Specialpgm {

	public static void main(String[] args) {
		Place1 obj =new Place1("microsoft");
		obj.Ename("varun");
		obj.name("mysore");
		obj.id(120034);
		obj.location("bangalore");
		String s[]= {"HR","TESTING","DEVELOPMENT"};
		obj.depts(s);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		Employee2 obj1=new Place1("intel");
		obj1.Ename("santhosh");
		obj1.id(130089);
		obj1.location("pune");
		obj1.name("chennai");
		String p[]= {"HR","TESTING","DEVELOPMENT"};
		obj1.depts(p);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Company1 obj2=new Place1("tesla");
		obj2.location("new york");
		obj2.name("hong kong");
		
		
	}

}
