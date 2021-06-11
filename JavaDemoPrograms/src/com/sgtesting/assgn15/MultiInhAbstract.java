package com.sgtesting.assgn15;

abstract class Company
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
abstract class Employee1 extends Company
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
class Place extends Employee1
{
	
	void Ename(String ename)
	{
		System.out.println("name of the employee is "+ename);
	}
	void pname(String name)
	{
		System.out.println("place of the employee is "+name);
	}

}
public class MultiInhAbstract {

	public static void main(String[] args) {
		Place obj =new Place();//Class members accessed through sub class object
		obj.Ename("varun");
		obj.name("microsoft");
		obj.pname("pune");
		obj.id(120034);
		obj.location("bangalore");
		String s[]= {"HR","TESTING","DEVELOPMENT"};
		obj.depts(s);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		Employee1 obj1=new Place();//Class members accessed through immediate reference i.e., immediate class of superclass
		obj1.Ename("santhosh");
		obj1.id(130089);
		obj1.location("pune");
		obj1.name("intel");
		String p[]= {"HR","TESTING","DEVELOPMENT"};
		obj1.depts(p);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Company obj2=new Place();//Class members accessed through superclass reference
		obj2.location("new york");
		obj2.name("hong kong");
		String q[]= {"HR","TESTING","DEVELOPMENT"};
		obj2.depts(q);
	
		
		
	}

}
