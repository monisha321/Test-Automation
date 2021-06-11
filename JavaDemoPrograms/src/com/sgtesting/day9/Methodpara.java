package com.sgtesting.day9;
class calculation1
{
	void addition(int x,int y)//method with  parameters
	{
		int z;
		z=x+y;
		System.out.println("sum of x and y is "+z);
	}
}
public class Methodpara {

	public static void main(String[] args) {
		calculation1 obj= new calculation1();
		obj.addition(30,40);
		obj.addition(90, 45);
	}


}
