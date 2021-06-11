package com.sgtesting.assgn14;
class Industry
{
	String name;
	void display1()
	{
		
		System.out.println("the name of the company is "+name);
	}
}
class Employee3 extends Industry
{
	String name;
	Employee3(String name)
	{
		super.name=name;
	}
	void display2()
	{
		
		System.out.println("the name os the employee3 is "+name);
	}
}
class Employee4 extends Industry
{
	String name;
	Employee4(String name)
	{
		super.name=name;
	}	
	void display3()
	{
		//this.name=name;
		System.out.println("the name of the employee4 is "+name);
	}
}
class Place1 extends Employee4
{
	String name;
	Place1(String name)
	{
		super(name);
	}
	
	
	void display4()
	{
		System.out.println("hometown of Employee4 is "+name);
	}
}
public class HybridInh1 {

	public static void main(String[] args) {
		Employee4 obj2=new Employee4("wipro");
		obj2.name="mittal";
		obj2.display3();
		obj2.display1();
		
		Employee3 obj1=new Employee3("intel");
		obj1.name="rahul";
		obj1.display1();
		obj1.display2();
		
		System.out.println("+++++++++++++++++++++++++++++++");
		
		Place1 obj=new Place1("microsoft");
		obj.name="mysore";
		obj.display4();
		obj.display3();
		obj.display1();
		
		
	}

}
