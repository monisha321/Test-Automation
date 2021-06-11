package com.sgtesting.reflection4;

public class StringBuilderDemo {

	
	public static void appendString()
	{
		StringBuilder s=new StringBuilder("Java");
		s.append(" Program");
		System.out.println("Result :"+s);
		System.out.println("++++++++++++++++++++++");
	}
	
	public static void insertString()
	{
		StringBuilder s=new StringBuilder("It is a palace");
		s.insert(8, "new ");
		System.out.println(s);
		System.out.println("++++++++++++++++++++++");
	}
	
	public static void deleteString()
	{
		StringBuilder s=new StringBuilder("It is a new palace");
		s.delete(8, 12);
		System.out.println(s);
		System.out.println("++++++++++++++++++++++");
	}
	
	public static void reverseString()
	{
		StringBuilder s=new StringBuilder("Programming");
		s.reverse();
		System.out.println(s);
		System.out.println("++++++++++++++++++++++");
	}
	

}
