package com.sgtesting.assgn17;

public class StringReverse {

	public static void main(String[] args) {
		//subString();
		getCharArray();
		charAtStr();
	}
	static void subString()	
	{
		String s="java program";
		String ch[]=new String[s.length()];
		int k=0;
		for (int i=0;i<=(s.length()-1);i++)
		{
			ch[k]=s.substring(i,i+1);
			k++;
		}
		for(int j=(ch.length-1);j>=0;j--)
		{
			System.out.print(ch[j]);
		}	
	}

	static void getCharArray()
	{
		String s="java program";
		char ch[]=s.toCharArray();
		String s1="";
	

		for(int i=(ch.length-1);i>=0;i--)
		{
			s1=s1+ch[i];
		}
		System.out.println(s1);		
	}
	
	static void charAtStr()
	{
		String s="java program";
		for(int i=(s.length()-1);i>=0;i--)
		{
		char ch=s.charAt(i);
		System.out.print(ch);
		}
	}
}
