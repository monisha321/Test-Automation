package com.sgtesting.assgn16;
interface AA
{
	void name(String name);
}
interface BB
{
	void age(int age);
}
class AA1 implements AA,BB
{
	public void name(String name)
	{
		System.out.println("name of the person is "+name);
	}
	public void age(int age)
	{
		System.out.println("age of the person is "+age);
	}
}
public class MultipleInterfaces {

	public static void main(String[] args) {
		AA1 obj=new AA1();
		obj.age(12);
		obj.name("rahul");
	}

}
