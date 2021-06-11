package com.sgtesting.assgn19StringFileTest;

public class StringImmutable {

	public static void main(String[] args) {
		String s1="java";
		System.out.println("the input string is "+s1);
		s1.concat("program");
		System.out.println("string is immutable "+s1);
		String s2=new String("mango");
		System.out.println(s2);
		s2.concat("is ");
		System.out.println(s2);
		s2.concat("king");
		System.out.println(s2);
	}
	
}
