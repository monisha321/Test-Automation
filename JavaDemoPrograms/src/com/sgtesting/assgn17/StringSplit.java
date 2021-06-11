package com.sgtesting.assgn17;

public class StringSplit {

	public static void main(String[] args) {
		splitStr();
	}	
	
	static void splitStr()
	{
		String s="Bangalore and Mysore";
		String s1[]=s.split(" ");
		String s2="";
		for (int i = s1.length - 1; i >= 0; i--)
		{ 
	        s2 += s1[i] + " "; 
	      }
		System.out.println(s2);
	}
	

}
