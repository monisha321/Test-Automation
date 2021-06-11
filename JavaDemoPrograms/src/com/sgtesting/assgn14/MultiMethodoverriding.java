package com.sgtesting.assgn14;
class A
{
	void add(int x,int y)
	{
		System.out.println("A = "+(x+y));
	}
}
class B extends A
{
	int x,y;
	void add(int x,int y)
	{
		super.add(x,y);
		this.x=x;
		this.y=y;
		System.out.println("B ="+(x+y));
	}
	B(int x,int y)
	{
		super.add(x,y);
	}
	
	
}
class C extends B
{

	void add(int x, int y)
	{
		
		System.out.println("C = "+(x+y));
	}
	C(int x,int y)
	{
		
		super(x,y);
	}
}
public class MultiMethodoverriding {

	public static void main(String[] args) {
		
		
		B obj1=new B(2,7);//class A
		obj1.add(3, 3);//class B
		C o=new C(10,2);//class A
		o.add(1, 2);//class C
	}

}
