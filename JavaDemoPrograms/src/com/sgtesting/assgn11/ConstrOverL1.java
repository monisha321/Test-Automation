package com.sgtesting.assgn11;

class University//The biggest advantage of Constructor overloading is flexibility which allows you to create the object in a different way
{
	University(String s)
	{
		System.out.println("University name is : "+s);
		
	}
	University(int x)
	{
		System.out.println("rank of University is: "+x);
	}
	University (String a,int b)
	{
		System.out.println("located in "+a+" and strength of University is :"+b);
	}

}
public class ConstrOverL1 {
	public static void main(String[] args) {
		University obj=new University("vtu");//for each constructor different objects must be created 
		University obj1=new University("bangalore");
		University o=new University(112);
		University obj2=new University("karnataka",35000);
	}

}

/*
University(String s,int x,String a,int b)
{
	System.out.println("University name is : "+s);
	System.out.println("rank of University is: "+x);
	System.out.println("located in "+a+" and strength of University is :"+b);
}

University obj=new University("vtu",112,"bangalore",5600);----here the parameters have to be passed in the same order and cant be omitted from entry,thrfr user cant change only one or two parameters.
*/