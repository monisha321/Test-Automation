package com.sgtesting.assgn19StringFileTest;

public class StringCharCount {

	public static void main(String[] args) {
		charAt();

	}
	static void charAt()
	{
		String s="himalayas are the abode of rishis";
		int count=0;
		try
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				char ch=s.charAt(i);
				if(ch!=' ')
				{
					count++;
				}
			}
			System.out.println("number of characters is "+count);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
