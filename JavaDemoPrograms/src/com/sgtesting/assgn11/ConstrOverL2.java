package com.sgtesting.assgn11;

class Student
{
	Student(String s)
	{
		System.out.println("Student name is : "+s);
	}
	Student(int x)
	{
		System.out.println("rank of Student is: "+x);
	}
	Student (String a,int b)
	{
		System.out.println("from "+a+" and roll no of Student is :"+b);
	}

}
public class ConstrOverL2 {
	public static void main(String[] args) {
		Student obj=new Student(125);
		Student obj1=new Student("santhosh");
		Student obj2=new Student("karnataka",35);
	}

}
