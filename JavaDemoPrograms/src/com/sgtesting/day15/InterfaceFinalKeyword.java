package com.sgtesting.day15;
final class Demo1//all members of this class becomes final by default even if final keyword is not mentioned
{
	final int age=90;
	final void display()//superclass final method can be inside normal class also
	{
		System.out.println("in super class ,the display method ");
		System.out.println(age);
	}
}
//class Demo2 extends Demo1//-->shows error becoz final class cant be extended by sub class
//{
	//void display()//usually overrides but now doesnt and provides compilation error
	//{
	//	System.out.println("in sub class ,the display method ");
	//}
//}
public class InterfaceFinalKeyword {//final cant be modified throughout the pgm

	public static void main(String[] args) {
		Demo1 obj=new Demo1();
		obj.display();
	}

}
