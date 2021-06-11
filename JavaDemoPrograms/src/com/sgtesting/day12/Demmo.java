package com.sgtesting.day12;
class Demmo1
{
	static int count=0;
	static int count1=0;//if static is removed here, count1 o/p is just 1---check
	Demmo1()//constructor
	{
		count=count+1;//counts no. of objects
		count1=count1+1;//counts no. of objects
	}
}
public class Demmo {//to find no. of objects created for a respective CLASS

	public static void main(String[] args) {
		Demmo1 obj=new Demmo1();
		Demmo1 obj1=new Demmo1();
		Demmo1 obj2=new Demmo1();
		System.out.println("number of objects (static call)"+Demmo1.count);
		System.out.println("number of objects=count "+obj.count);
		System.out.println("number of objects=count "+obj1.count);
		System.out.println("number of objects=count "+obj2.count);
		System.out.println("number of objects=count1 "+obj.count1);
		System.out.println("number of objects=count1 "+obj1.count1);
		//System.out.println("number of objects "+Demmo1.count1);//---see the error message
	}

}
