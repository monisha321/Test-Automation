package com.sgtesting.assgn19StringFileTest;

public class StringBufferMutable {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("java");
		System.out.println("before appending the string is "+s);
		s.append(" program");
		System.out.println("after appending= the string is mutable "+s);
		s.append(" language");
		System.out.println("after appending= the string is mutable "+s);
	}

}
