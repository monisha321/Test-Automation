package com.sgtesting.day13;


class Outer
{
	String firstname="santhosh";
	void showage()
	{
		System.out.println("age is "+Inner.age);//imp//NO NEED TO CREATE OBJECT to access STATIC inner class
	}


	static class Inner
	{
		
		
		static int age=18;	//variable must be static
		
		static void showFn()//outer class details can be accessed directly
		{
			System.out.println("fisrtanem is "+new Outer().firstname);
			
		}
		
	}
}

public class Innerstatic {

	public static void main(String[] args) {
		//Outer obj=new Outer();
		//obj.showage();
		new Outer().showage();
		Outer.Inner.showFn();//NO NEED TO CREATE OBJECT FOR STATIC INNER CLASS




	}

}
