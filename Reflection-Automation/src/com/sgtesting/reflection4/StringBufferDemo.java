package com.sgtesting.reflection4;

public class StringBufferDemo {

		
	public static void appendString()
	{
		StringBuffer s=new StringBuffer("Java");
		s.append(" Program");
		System.out.println("Result :"+s);
		System.out.println("++++++++++++++++++++++");
	}
	
	public static void insertString()
	{
		StringBuffer s=new StringBuffer("It is a palace");
		s.insert(8, "new ");
		System.out.println(s);
		System.out.println("++++++++++++++++++++++");
	}
	
	public static void deleteString()
	{
		StringBuffer s=new StringBuffer("It is a new palace");
		s.delete(8, 12);
		System.out.println(s);
		System.out.println("++++++++++++++++++++++");
	}
	
	public static void reverseString()
	{
		StringBuffer s=new StringBuffer("Programming");
		s.reverse();
		System.out.println(s);
		System.out.println("++++++++++++++++++++++");
	}
	

}
