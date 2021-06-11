package com.sgtesting.day15;

interface University1//similar rules as abstract
{
	void name(String name);//method by default is abstract and public but, abstract prefix is optional
	
}
interface University2 extends University1
{
	abstract void showcityname(String cityname);
}

class SJB implements University1,University2//subclass(one subclass can extend multiple interfaces) (if subclass misses any one method then this class becomes abstract and another class must be created to implement the left out method)
{
	public void name(String name)//iterface method; 'public' keyword must be mentioned becoz by default interface method is also public
	{
		System.out.println("university name is "+name);
	}
	void showcollgename(String name)
	{
		System.out.println("college name is "+name);
	}
	public void showcityname(String cityname)
	{
		System.out.println("city name is "+cityname);
	}
}


public class InterfaceCase2 {//sub class can extend multiple interfaces(unlike in abstract ) 

	public static void main(String[] args) {
		SJB obj=new SJB();
		obj.name("vtu");
		obj.showcollgename("bms");
		obj.showcityname("bangalore");
		System.out.println("+++++++++++++++");
		University obj1=new BMS();//object cant be created for interface ,it can only be refered
		obj1.name("andhra");
	}

}
