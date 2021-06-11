package com.sgtesting.assgn15;
abstract class Calculation
{
	int x,y;//instance variables
	static int a,b;//static variables
	Calculation()
	{
		addition(20,30);
		//Calc.sub();//works fine
	}
	void addition(int x,int y)//instance method
	{
		this.x=x;
		this.y=y;
		System.out.println("addition res is:"+(x+y));
	}
	static void sub()//static method
	{
		//Calculation o=new Calc();//--works fine
		//o.addition(3,2);
		System.out.println("subtraction res is:"+(a-b));
	}
}
class Calc extends Calculation//even if sub class is blank(i.e., no method,here division), the program works
{
	void division(int x,int y)
	{
		System.out.println("division result is "+(x/y));
	}
}
public class Abstractinstancestatic {

	public static void main(String[] args) {
		Calculation obj=new Calc();//object cant be created for abstract class,it can only be refered,thrfr needs sub class always 
		obj.addition(10, 20);
		Calc.a=30;
		Calc.b=20;
		Calc.sub();
		Calculation.sub();
		
		System.out.println("++++++++++++++++++++++++++");
		
		Calc obj1=new Calc();
		obj1.addition(2, 3);
		obj1.division(4, 2);
		Calc.a=40;
		Calc.b=33;
		Calc.sub();
		Calculation.sub();
		
		
	}

}
