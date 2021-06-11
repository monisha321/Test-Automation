package com.sgtesting.day8;
class Humannew
{

	String firstname;
	int age;
	
	Humannew()
	{
		firstname="rahul";
		age=12;
	}
}
public class Noargsconstructor {

	public static void main(String[] args) {
		Humannew o=new Humannew();
		System.out.println("firstname is :"+o.firstname);
		System.out.println("age is :"+o.age);
	}

}