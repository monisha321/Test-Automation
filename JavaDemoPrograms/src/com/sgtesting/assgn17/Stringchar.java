package com.sgtesting.assgn17;

public class Stringchar {

	public static void main(String[] args) {//find no of chars in a string without using length method
		
		getCharArray();	

	}
	static void getCharArray()
	{
		int count=0;
		String s="java programming language";
		char ch[]=s.toCharArray();
		for( char ch1:ch)
		{
			//System.out.println(ch1);
			if(ch1!=' ')
			{
				count++;
			}
		}
		System.out.println("number of characters in string s is "+count);
	}
}
