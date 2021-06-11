package com.sgtesting.assgn17;

public class StringCaseCount {

	public static void main(String[] args) {
		charAtStr();
	}
	static void charAtStr()
	{
		String s="java program";
		int count=0,count1=0;
		for(int i=(s.length()-1);i>=0;i--)
		{
			char ch=s.charAt(i);
			if(Character.isLowerCase(ch))
			{
				count++;
			}
			else if(Character.isUpperCase(ch))
			{
				count1++;
			}
		}
		System.out.println("the count of lower case letters in the string is "+count);
		System.out.println("the count of upper case letters in the string is "+count1);

	}
}
