package com.sgtesting.day15;
interface Person1
{
	void name(String name,String nam);
}
interface Person2 extends Person1
{
	void city(String city);
}
class AAA implements Person2
{
	public void name(String name,String nam)
	{
		System.out.println("name of the person is "+name+" "+nam);
	}
	public void city(String city)
	{
		System.out.println("hometown "+city);
	}
}
public class InterfaceCase3 {//an interface extends another interface

	public static void main(String[] args) {
		AAA obj=new AAA();
		obj.city("bangalore");
		obj.name("santhosh","s");
	}

}
