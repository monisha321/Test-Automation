package com.sgtesting.assgn19StringFileTest;

public class StringReverse {

	public static void main(String[] args) {
		charAt();
		getCharArray();
		subString();
	}
	static void charAt()
	{
		String s="lion king";
		try
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				char ch=s.charAt(i);
				System.out.print(ch);
			}
			System.out.println();
			System.out.println("++++++++++++++++++++++++++");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void getCharArray()
	{
		String s="mother nature";
		char ch[]=s.toCharArray();
		String s1="";

		try
		{
			for(int i=ch.length-1;i>=0;i--)
			{
				s1=s1+ch[i];
			}
			System.out.println(s1);
			System.out.println("+++++++++++++++++++++++++++++++++++");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void subString()
	{
		String s="bangalore press";
		String ch[]=new String[s.length()];
		int k=0;

		try
		{

			for(int i=0;i<=s.length()-1;i++)
			{
				ch[k]=s.substring(i,i+1);
				k++;
			}
			for(int j=ch.length-1;j>=0;j--)
			{
				System.out.print(ch[j]);
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
