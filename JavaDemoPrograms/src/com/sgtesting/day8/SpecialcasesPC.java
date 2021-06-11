package com.sgtesting.day8;
class Man
{
	String firstname;
	int age;
	Man(String fn,int a)
	{
		//firstname=fn; --------when parameters are not assigned to instance variables, we still get the o/p
		//age=a;
		System.out.println("firstname is :"+fn);//fn can be replaced by firstname also
		System.out.println("age is :"+a);//a can be replaced by age also, v ll get same o/p
		System.out.println("+++++++++++++++++++++++++");
	}
}
public class SpecialcasesPC {

	public static void main(String[] args) {
		Man o=new Man("sachin",50);
		Man p=new Man("rahul",50);
	}

}//but thr r limitations when a method is used.see the o/p of next pgm SpacialcaseMethodPc
