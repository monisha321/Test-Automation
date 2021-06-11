package com.sgtesting.assgn16;
interface Person1
{
	void name(String name);
}
interface Person2
{
	void age(int age);
}
class BB1
{
	void city(String name)
	{
		System.out.println("hometown is "+name);
	}
}
class AA2 extends BB1 implements Person1,Person2
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
public class MultipleInterfaceSuperSubClass {

	public static void main(String[] args) {
		AA2 obj=new AA2();
		obj.age(31);
		obj.city("london");
		obj.name("peter");
	}

}
