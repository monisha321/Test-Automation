package com.sgtesting.day8;
class Human1
{
	String firstname;
	int age;
	
	Human1(String fn,int a)//fn,a are parameters for this constructor and can be accessed only in this constructor nd not outside this
	{
		firstname=fn;
		age=a;//if parameter name is same as instance (age=age) then,o/p is 0.(value wont be assigned to instance and parameter hides or dominates the instance. (solution is'this' operator)
		
	}
}
public class Parameterisedconstructor {

	public static void main(String[] args) {
		Human1 o=new Human1("sachin",50);
		Human1 p=new Human1("rahul",60);
		System.out.println("firstname is :"+o.firstname);
		System.out.println("age is :"+p.age);
		System.out.println("+++++++++++++++++++++++++");
	}

}
