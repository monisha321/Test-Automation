package com.sgtesting.day12;
class Demo
{
	static void addition(int x,int y)//static method
	{
		System.out.println("addition res is:"+(x+y));
	}
	static void multiply(int x,int y)
	{
		System.out.println("multiplication res is:"+(x+y));
	}
	
}
public class Staticmethodinindependentclass {

	
	public static void main(String[] args) {
		/*addition(12,45);//static methods in independent class can't be accessed directly in the main method
		multiply(3,4);*/
		
		Demo.addition(10, 20);//classname.static method name must be used to access static methods
		Demo.multiply(4, 5);
	}

}
