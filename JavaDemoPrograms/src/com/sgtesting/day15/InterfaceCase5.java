package com.sgtesting.day15;
interface Personnn
{
	void name(String name);
}
class AB implements Personnn
{
	public void name(String name)
	{
		System.out.println("name of the person is "+name);
	}
	void city(String city)
	{
		System.out.println("hometown  is  "+city);
	}
}
public class InterfaceCase5 {//object cant be created for interface ,it can only be referred

	public static void main(String[] args) {
		Personnn obj=new AB();
		obj.name("santhosh");
		//obj.city("bangalore");-->interface cant access class's method
	}

}
