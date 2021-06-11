package com.sgtesting.assgn17;

public class StringPalindrome {

	public static void main(String[] args) {
		compareStr();

	}
	
	static void compareStr()
	{
		String s="malayalam";
		char ch[]=s.toCharArray();
		String s1="";
	

		for(int i=(ch.length-1);i>=0;i--)
		{
			s1=s1+ch[i];
		}
		System.out.println(s1);
		
		if(s1.equals(s))
		{
			System.out.println("the string is a palindrome");
		}
		else
		{
			System.out.println("the string is not a palindrome");
		}
	}
	
		
	

}
