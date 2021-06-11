package com.sgtesting.day7encapsulation;
/*class Human
{
	String firstname;----instance variables
	int age;
}*/
public class Human {
	String firstname;//firstname=instance variable 
	int age;//age=instance variable
	
	
	
	
	public static void main(String[] args) {
		//String firstname;//firstname=local variable
		//int age;//age=local variable
		
//instance variables cant be accessed directly bcoz main method is static method.
		Human o=new Human();//object "o" is created to access instance members of class Human
		
		o.firstname="sachin";
		o.age=50;
		System.out.println("first name is: "+o.firstname);
		System.out.println("age is :"+o.age);
		
		System.out.println();
		
		Human rahul=new Human();//multiple objects can be created for the same class Human
		rahul.firstname="rahul dravid";
		rahul.age=50;
		System.out.println("firstname is: "+rahul.firstname);
		System.out.println("age is: "+rahul.age);
	}

}
