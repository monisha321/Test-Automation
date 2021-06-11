package com.sgtesting.assgn17;

public class StringPalindrome1 {

	public static void main(String[] args) {

		int k=0;
		int count=0;
		String str="malayala";
		//char s[]=str.toCharArray();
		char h[]=new char[str.length()];
		for(int i=str.length()-1;i>=0;i--)
		{
			h[k]=str.charAt(i);
			k++;
		}
		for(int j=0;j<str.length();j++)
		{
			if(h[j]==str.charAt(j))
			{
				count++;
			}
		}
		if(count==str.length())
		{
			System.out.println(str+" ----> is palindrome!!");
		}
		else
		{
			System.out.println(str+" ----> is not palindrome!!");
		}

	}

}
