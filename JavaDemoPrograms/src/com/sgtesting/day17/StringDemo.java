package com.sgtesting.day17;

public class StringDemo {//string immutable //constant pool

	public static void main(String[] args) {
		String s="java";//s is reference variable,java is string object
		System.out.println(s);
		s.concat("programming");
		System.out.println(s);//output will be same because thr is no reference for s.concat even though object/memory of it is created
		//String a=s.concat("programming");//here reference is provided thrfr prints the concated o/p when called through the reference
		//System.out.println(a);
		s.concat("language");
		System.out.println(s);
		String s1=new String("javaaa");
		System.out.println(s1);
		int a=12;
		System.out.println(a);
		//int b=new int(12);//cant be written for other datatypes
		
		//constant pool
		String s2="Java";
		System.out.println("s2 "+s2);
		String s3="JAVA";
		System.out.println("s3 "+ s3);
		String s4="java";//as it is same as s , only one object is created instead of 2 in the constant pool memory
		System.out.println("s4 "+ s4);
		if(s==s4)
		{
			System.out.println("true");
		}
		if(s==s3)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(s==s2)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
	//using new operator= creates object for every reference in heap memoryi.e., heap accepts duplicate objects
		String s5=new String("Java");
		System.out.println("s2 "+s2);
		String s6=new String("JAVA");
		System.out.println("s3 "+ s3);
		String s7=new String("java");
		System.out.println("s4 "+ s4);
		if(s==s5)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(s==s6)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(s==s7)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		//CONSTRUCTOR OVERLOADING
		String b=new String();
		//String b=new String("Testing");
		char ch[]={'X','y','z'};
		//String b=new String(ch);
		//String b=new String("Testing");
		String a1=new String(b);
		//StringBuffer b=new StringBuffer("Testing");
		//String a1=new String(b);
		//StringBuilder b=new StringBuilder("Testing");
		//String a1=new String(b);
	}

}
