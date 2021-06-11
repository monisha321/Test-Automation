package com.sgtesting.assgn14;

class Hyb1
{
	String name;
	void display1(String name)
	{
		this.name=name;
		System.out.println("Name in super class is "+name);
	}
}
class Hyb2 extends Hyb1
{
	String name;
	void display2(String name)
	{
		this.name=name;
		System.out.println("Namen in  first subclass is "+name);
	}
}
class Hyb3 extends Hyb1
{
	String name;
	void diaplay3(String name)
	{
		this.name=name;
		System.out.println("Name in Second subclass is "+name);
	}
}
class Hyb4 extends Hyb3
{
	String name;
	Hyb4(String name)//--->even without this program gives same o/p = this program is wrong
	 {
		 super.name=name;
	 }
	void display4()
	{
		System.out.println("Name in Third subclass is: "+name);
	}
}


public class HybInh {

	public static void main(String[] args) {
	
		Hyb4 obj=new Hyb4("sooraj");
		obj.name="Subbu";
		obj.display4();
		obj.display1("Scoot");
		obj.diaplay3("Allen");
		
		Hyb2 obj1=new Hyb2();
		obj1.display2("The Rock");

	}

}
