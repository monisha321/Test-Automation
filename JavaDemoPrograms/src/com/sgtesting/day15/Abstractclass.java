package com.sgtesting.day15;
abstract class Enggcoll//even if thr is no abstract method, class can be abstarct; object cant be created for abstract class
{
	abstract void showcollname(String name);//abstarct method must be inside abstarct class
	abstract void showcity(String city);
	void showbranch(String bname[])//instance method
	{
		System.out.println("branch names");
		for(int i=0;i<bname.length;i++)
		{
			System.out.println(bname[i]);
		}

	}
}
class SLB extends Enggcoll//subclass must contain all the abstract methods of superclass (if it misses any abstract method then this class becomes abstract and another sub class must be created)
{
	void showcollname(String name)
	{
		System.out.println(name);
	}
	void showcity(String city)
	{
		System.out.println(city);
	}
	void address(String add)//sub class can have its own methods
	{
		System.out.println(add);
	}
}
public class Abstractclass {
	public static void main(String[] args) {
		SLB obj=new SLB();//Enggcoll obj=new SLB(); --->this will not allow to access "obj.address("mg road");" becoz this method is not in abstract class
		obj.showcity("mysore");
		obj.showcollname("SJBIT");
		obj.address("mg road");
		String s[]= {"eee","ece"};
		obj.showbranch(s);


	}

}
