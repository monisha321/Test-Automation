package com.sgtesting.day13;
/*
 1.create a private constructor nd thrfr it restricts creation of object
 2.write a static method,create an object and call it
 3.apply logic to check whether the value of object is null */

class Testt
{
	public static Testt obj=null;//ref variable by default contains null value; this is made static becoz it can then be called directly in the static method created below
	private Testt()//private constructor(constructor name=class name)
	{
		
	}
	
	void addition(int x,int y)//instance method
	{
		int res=(x+y);
		System.out.println("addition result is "+res);
	}
	void multiplication(int x,int y)
	{
		int res1=(x*y);
		System.out.println("multiplication result is "+res1);
	}
	
	public static Testt getInstance()//static method (name can be anything)
	{
		if (obj==null)//.apply logic to check whether the value of object is null
		{
		obj=new Testt();
		}
		return obj;
	}
}
public class Singletondemo1 {

	public static void main(String[] args) {
		Testt t=Testt.getInstance(); 
		t.addition(10, 20);
		t.multiplication(2, 3);
		t.addition(50, 50);//multiple values can be passed using single object when singleton method is used
		t.multiplication(2, 6);
		
		Testt t1=Testt.getInstance();//---use this to check whether singleton model works.
		t.addition(2, 30);
		t.multiplication(3, 8);
		
		Testt t2=Testt.getInstance();
		t2.addition(100, 20);
		t2.multiplication(20, 3);
		
		if((t==t1)&&(t==t2))
		{
			System.out.println("singleton achieved");
		}
	}

}
