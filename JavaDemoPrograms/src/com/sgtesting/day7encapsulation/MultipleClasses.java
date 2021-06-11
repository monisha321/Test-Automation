package com.sgtesting.day7encapsulation;
class Person
{
	String firstname;
	int age;
}
class Birds
{
	String coloroweather;
	int noofwings;
}
class Domesticanimal
{
	String breedname;
	int quantityofmilk;
}
public class MultipleClasses {

	public static void main(String[] args) {
		Person obj=new Person();//default constructor here is 'Person()'
		obj.firstname="sachin";
		obj.age=50;
		System.out.println("firstname is: "+obj.firstname);
		System.out.println("age is "+obj.age);
		System.out.println("+++++++++++++++++++++");

		Birds r=new Birds();
		r.coloroweather="white";
		r.noofwings=2;
		System.out.println("color of feathers: "+r.coloroweather);
		System.out.println("no of wings :"+r.noofwings);
		System.out.println("++++++++++++++");

		Domesticanimal cow=new Domesticanimal();
		cow.breedname="jersye";
		cow.quantityofmilk=50;
		System.out.println("breedname is:"+cow.breedname);
		System.out.println("quantity of milk:"+cow.quantityofmilk);
	}

}
