package com.sgtesting.day8;
class Humans
{
	String firstname;
	int age;
	char ch;
	Humans(String fn,int age)//parameters can be used within this constructor only
	{
		this.firstname=fn;//'this'  is used with instance variable and not parameter
		this.age=age;//this is mandatory in constructor to differentiate especially when same names are given 
		
		System.out.println("firstname is :"+this.firstname);//even parameter fn can b used here
		System.out.println("age is :"+this.age);
		System.out.println("+++++++++++++++++++++++++");
	}
	void display(char ch)//method
	{
		this.ch=ch;
		System.out.println("initial is "+ch);//parameter of this method can be used
		System.out.println("firstname: "+this.firstname);//this may or may not be used here,doesnt matter but,cant use parameter of another constructor or method
		System.out.println("age :"+age);
	}
}
public class This {

	public static void main(String[] args) {
		Humans o=new Humans("sachin",50);
		Humans p=new Humans("rahul",50);
		o.display('n');

	}

}
