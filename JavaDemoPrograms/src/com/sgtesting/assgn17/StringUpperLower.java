package com.sgtesting.assgn17;

public class StringUpperLower {

	public static void main(String[] args) {
		charAtStr();
	}
	static void charAtStr()
	{
		String s="Java Program";
		String s1="",s2="";
		for(int i=0;i<=(s.length()-1);i++)
		{
			char ch=s.charAt(i);
			if(Character.isLowerCase(ch))
			{
				s1=s1+ch;
			}
			else if(Character.isUpperCase(ch))
			{
				s2=s2+ch;
			}
		}
		System.out.println("the lower case letters in the string are: "+s1);
		System.out.println("the upper case letters in the string are: "+s2);
}
}