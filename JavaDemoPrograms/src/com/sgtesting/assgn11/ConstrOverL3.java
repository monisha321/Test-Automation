package com.sgtesting.assgn11;

class Employee
{
	Employee(String s)
	{
		System.out.println("Employee name is : "+s);
	}
	Employee(int x)
	{
		System.out.println("salary of Employee is: "+x);
	}
	Employee (String a,String b)
	{
		System.out.println("from "+a+" and working as :"+b);
	}

}
public class ConstrOverL3 {
	public static void main(String[] args) {
		Employee obj=new Employee(125000);
		Employee obj1=new Employee("santhosh");
		Employee obj2=new Employee("karnataka","engineer");
	}

}

