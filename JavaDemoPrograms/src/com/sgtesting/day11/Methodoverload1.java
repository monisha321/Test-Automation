package com.sgtesting.day11;
class Overload
{
	void display(String firstname)
	{
		System.out.println("firstname is :"+firstname);
	}	
	void display(int age)
	{
		System.out.println("age is "+age);
	}
	
	void display(String middlename,String lastname)
	{
		System.out.println("middlename "+middlename+"lastname "+lastname);
		
	}
}
public class Methodoverload1 {//to maintain same name to avoid confusion(but acts differently based on different datatypes of parameters passed

	public static void main(String[] args) {
		Overload obj=new Overload();
		obj.display(23);
		obj.display("rahul");
		obj.display("dravid", "mumbai");
		obj.display("sachin", "tendulkar");
		
	}

}
