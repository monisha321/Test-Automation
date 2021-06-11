package com.sgtesting.day12;

public class StaticmethodinMAINclass {//main class
	// int age;//--->works only if it is static,bcoz non-static cant be accessed directly in main method
	static int x,y;//x and y has to be static becoz it is being used in static method
	static void addition(int x,int y)//static method
	{
		System.out.println("addition res is:"+(x+y));
	}
	static void multiply()
	{
		System.out.println("multiplication res is:"+(x*y));
	}
	
	
	
	public static void main(String[] args) {//main method
		addition(12,45);//static members IN THE MAIN CLASS can be accessed directly in the main method
		multiply();//here o/p is zero bcoz method is called before assigning values
		x=3;y=9;
		multiply();
		//age=19;
		//System.out.println(age);
	}

}
