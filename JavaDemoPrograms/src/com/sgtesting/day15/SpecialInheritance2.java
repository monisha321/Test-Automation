package com.sgtesting.day15;
class Samplecity1
{
	void showcity(String name)
	{
		System.out.println("city name is "+name);
	}
}

class Samplecity extends Samplecity1
{
	Samplecity(String cname)//constructor here is used to override  subclass hiding the superclass method---here the method of superclass can be accessed
	{
		super.showcity(cname);
	}
	
	void showcity(String name)
	{
		System.out.println("city name in sub class is "+name);	
	}
}

public class SpecialInheritance2 {//METHOD OVERRIDING(constructor is created in sub class to access super class's method)= when super class and sub class has same method name and signature
	public static void main(String[] args) {
		
		Samplecity obj= new Samplecity("bangalore");//superclass method takes the value
		obj.showcity("london");//subclass method takes this value
	}

}
