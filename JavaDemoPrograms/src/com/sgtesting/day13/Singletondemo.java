package com.sgtesting.day13;
class Testbeforesingleton
{
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
}
public class Singletondemo {

	public static void main(String[] args) {
		Testbeforesingleton t=new Testbeforesingleton();
		t.addition(10, 20);
		t.multiplication(2, 3);
		
		Testbeforesingleton t1=new Testbeforesingleton();// n number of objects can be created
		t1.addition(2, 30);
		t1.multiplication(3, 8);
		
		Testbeforesingleton t2=new Testbeforesingleton();
		t2.addition(100, 20);
		t2.multiplication(20, 3);
	}

}
