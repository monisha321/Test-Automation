package com.sgtesting.assgn14;
class Industry1
{
	Industry1(String name)
	{
		System.out.println("the name of the company is "+name);
		
	}
	Industry1(String place,int Nemployee)
	{
		System.out.println("located in "+place);
		System.out.println("no of employees present "+Nemployee);
	}
}
class Employee5 extends Industry1
{
	
	Employee5(String name)
	{
		super(name);
	}
	Employee5(String place,int emp)
	{
		super(place,emp);
	}
	void display2(String name)
	{
		
		System.out.println("the name os the employee3 is "+name);
	}
}
class Employee6 extends Industry1
{
	
	Employee6(String name)
	{
		super(name);
	}	
	Employee6(String place,int emp)
	{
		super(place,emp);
	}
	void display3(String name)
	{
		System.out.println("the name of the employee4 is "+name);
	}
}
class Place2 extends Employee6
{
	
	Place2(String name)
	{
		super(name);
	}
	Place2(String place,int emp)
	{
		super(place,emp);
	}
	
	void display4(String name)
	{
		System.out.println("hometown of Employee4 is "+name);
	}
}
public class HybridInh2 {

	public static void main(String[] args) {
		Place2 obj=new Place2("intel");
		Place2 obj1=new Place2("bangalore",3500);
		obj.display3("rahul");
		obj.display4("mysore");
		System.out.println("++++++++++++++++++++++");
		Employee5 obj2=new Employee5("microsoft");
		Employee5 obj3=new Employee5("pune",3000);
		obj2.display2("sachin");
		
	}

}
