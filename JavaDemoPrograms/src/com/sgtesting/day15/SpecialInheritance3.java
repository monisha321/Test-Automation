package com.sgtesting.day15;
class AA//grandparent class
{
	AA()//super class constructor
	{
		System.out.println("AA");
	}
}
class BB extends AA//parent class
{
	BB()//super class to CC
	{
		//super();//by default super class no args constructor  is called
		System.out.println("BB");
	}
}
class CC extends AA//child class
{
	CC()//sub class constructor
	{
		//super();//by default super class no args constructor  is called..thrfr 1st AA constructor works nd then BB nd later CC
		System.out.println("CC");
	}
}
public class SpecialInheritance3 {//execution order of constructors in hierarchical inh(check similarly for other inheritances)

	public static void main(String[] args) {
		CC obj=new CC();
		System.out.println("++++++++++++++++++++");
		BB obj1=new BB();
		
	}

}
