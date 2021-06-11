package com.sgtesting.day13;
class Outer1
{
	String firstname="santhosh";

	Inner o=new Inner();//to access inner class details ,object must be created(for static inner class not necessary)
	
	void showage()
	{
		System.out.println("age is "+o.age);//imp
	}

	class Inner
	{
		int age=18;	
		void showFn()//static method cant be mentioned inside a non static class
		{
			firstname="rahul";
			System.out.println("inner fisrtanem is "+firstname);
			System.out.println("outer fisrtanem is "+new Outer1().firstname);
			
		}
	}
}
public class OuterInner {

	public static void main(String[] args) {

		//Outer1 obj=new Outer1();//object created to access outer class
		//obj.showage();

		new Outer1().showage();//accessing outer class without object creation

		new Outer1().o.showFn();//syntax for accessing/calling inner class...inner class is called thru outer class.
	}

}
