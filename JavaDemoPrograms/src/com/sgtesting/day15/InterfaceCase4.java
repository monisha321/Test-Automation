package com.sgtesting.day15;
interface Mathsss
{
	void addn(int x,int y);
	void subn(int a,int b);
}
abstract class Addn implements Mathsss
{
	public void addn(int x,int y)
	{
		System.out.println("addition result is "+(x+y));
	}
	
}
class Subn extends Addn
{
	public void subn(int a,int b)
	{
		System.out.println("subtraction result is "+(a-b));
	}
	
}
public class InterfaceCase4 {//if sub class misses to implement any method ,then it becomes abstract and another sub class is needed to implement the missed method

	public static void main(String[] args) {
		Subn obj=new Subn();
		obj.addn(10, 20);
		obj.subn(9, 5);
		
	}

}
