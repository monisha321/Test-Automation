package com.sgtesting.day11;
class CallBy
{
	void calculate(int a,int b)
	{
		a+=100;
		b*=8;
		System.out.println("within method value of a is :"+a);//o/p is based on values given in the object
		System.out.println("within method value of b is :"+b);
		
	}
}
public class CallByvalue {//primitive datatypes cant return values from the method

	public static void main(String[] args) {
		int a,b;//local variables
		a=10;b=5;
		System.out.println("before execution of method value of a is :"+a);
		System.out.println("before execution of method value of b is :"+b);
		
		CallBy obj=new CallBy();
		obj.calculate(a,b);//here variables a,b when left as it is ,takes the i/p given locally
		
		System.out.println("after execution of method value of a is :"+a);//shows o/p as that of i/p local variables and not based on method 
		System.out.println("after execution of method value of b is :"+b);
		
		
	}

}
