package com.sgtesting.day15;
class Placedetail1
{
	String city;//same variable name and datatype
	
	void displaycity1()
	{
		System.out.println("city name in superclass "+city);
	}
}
class Placedetail2 extends Placedetail1
{
	String city;//same variable name and datatype
	
	Placedetail2(String cname)
	{
		super.city=cname;
	}
	
	void showcity()
	{
		System.out.println("city name in sub class "+city);
	}
}
public class SpecialInheritance5 {//super class and sub class has same variable name and datatype

	public static void main(String[] args) {
		Placedetail2 obj= new Placedetail2("paris");//super class takes this value
		obj.city="london";//sub class takes this value
		obj.displaycity1();
		obj.showcity();
	}

}


/*o/p= city name in superclass null
city name in sub class london

class Placedetail1
{
	String city;
	void displaycity1()
	{
		System.out.println("city name in superclass "+city);
	}
}
class Placedetail2 extends Placedetail1
{
	String city;
	void showcity()
	{
		System.out.println("city name in sub class "+city);
	}
}
public class SpecialInheritance5 {//super class and sub class has same variable name and datatype

	public static void main(String[] args) {
		Placedetail2 obj= new Placedetail2();
		obj.city="london";
		obj.displaycity1();
		obj.showcity();
	}

} */
 