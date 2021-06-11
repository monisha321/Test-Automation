package com.sgtesting.assgn14;
class Company
{
	void display1()
	{
		String name="Intel";
		System.out.println("the name of the company is "+name);
	}
}
class Employee1 extends Company
{
	void display2()
	{
		String name="santhosh";
		System.out.println("the name os the employee1 is "+name);
	}
}
class Employee2 extends Company
{
	void display3()
	{
		String name="rahul";
		System.out.println("the name of the employee2 is "+name);
	}
}
class Place extends Employee2
{
	void display4(String hometown)
	{
		System.out.println("hometown of Employee2 is "+hometown);
	}
}
public class HybridInh {

	public static void main(String[] args) {
Place obj =new Place();
obj.display1();
obj.display3();
obj.display4("mysore");
System.out.println("+++++++++++++++++++++++++++++++++++");
Employee1 obj1=new Employee1();
obj1.display1();
obj1.display2();
	}

}
