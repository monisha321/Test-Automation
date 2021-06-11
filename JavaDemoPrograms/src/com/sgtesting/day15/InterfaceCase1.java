package com.sgtesting.day15;

interface University//similar rules as abstract
{
	void name(String name);//method by default is abstract and public but, abstract prefix is optional
	
}

class BMS implements University//subclass(one subclass can extend multiple interfaces) (if subclass misses any one method then this class becomes abstract and another class must be created to implement the left out method)
{
	public void name(String name)//iterface method; 'public' keyword must be mentioned becoz by default interface method is also public
	{
		System.out.println("university name is "+name);
	}
	void showcollgename(String name)
	{
		System.out.println("college name is "+name);
	}
}


public class InterfaceCase1 {//subclass implementing interface(similar to abstract class implementation)

	public static void main(String[] args) {
		BMS obj=new BMS();
		obj.name("vtu");
		obj.showcollgename("bms");
		System.out.println("+++++++++++++++");
		University obj1=new BMS();//object cant be created for interface ,it can only be refered
		obj1.name("andhra");
	}

}
