package com.sgtesting.assgn11;

class Department
{
	Department(String s)
	{
		System.out.println("Department name is : "+s);
	}
	Department(int x)
	{
		System.out.println("rank of Department is: "+x);
	}
	Department (String a,String b)
	{
		System.out.println("college "+a+" and located in :"+b);
	}

}
public class ConstrOverL4 {
	public static void main(String[] args) {
		Department obj=new Department(12);
		Department obj1=new Department("EEE");
		Department obj2=new Department("SJB IT","karnataka");
	}

}


