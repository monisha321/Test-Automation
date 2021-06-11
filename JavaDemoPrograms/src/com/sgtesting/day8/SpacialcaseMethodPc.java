package com.sgtesting.day8;
class Personn
{
	String firstname;
	int age;
	Personn(String fn,int a)
	{
		//firstname=fn;
		//age=a;
		System.out.println("firstname is :"+fn);//fn can be replaced by firstname also
		System.out.println("age is :"+a);//a can be replaced by age also, v ll get same o/p
		System.out.println("+++++++++++++++++++++++++");
	}
	void display()//method ---o/p is null if paramters are not assigned to instance variables in the constructor
	{
		System.out.println("firstname: "+firstname);
		System.out.println("age :"+age);
	}
}
public class SpacialcaseMethodPc {

	public static void main(String[] args) {
		Personn o=new Personn("sachin",50);
		o.display();//calling the method through object created
	}

}
