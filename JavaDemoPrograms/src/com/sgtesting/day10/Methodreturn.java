package com.sgtesting.day10;
class computation       //types of return
{
	int addition(int x,int y)
	{
		System.out.println(x+y);
		return x+y;
		
	}
	int x,y;
	int sub()
	{
		int x=8,y=7;//over rides o.x,o.y values.
		int e=sub();//we can call a method in its own body= called as RECURSION
		this.x=x;this.y=y;
		int res=x-y;
		System.out.println(res);
		return x;
		//return res;
	}
	
	void multiply()
	{
		int y=this.addition(10, 20);		//calling one method inside another method
		int x=sub();						//calling one method inside another method
		System.out.println("RESULT is "+(x*y));
	}
}
public class Methodreturn {

	public static void main(String[] args) {
		
		computation o=new computation();
		
		int a=o.addition(60, 70);
		System.out.println("return value from addition "+a);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		System.out.println(o.addition(2, 5));
		System.out.println("++++++++++++++++++++++++++++");
		
		o.sub();
		o.x=30;
		o.y=8;
		o.sub();
		System.out.println(o.sub());
		System.out.println("++++++++++++++++++++++++++++++++");
		
		o.multiply();

	}

}
