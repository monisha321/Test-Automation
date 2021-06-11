package com.sgtesting.assgn17;

public class StringInsert1 {

	public static void main(String[] args) {
		getCharArray();
	}
	static void getCharArray()
	{
		String s="SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(c[i]=='Y')
			{
				System.out.print(c[i]+",");
			}
			else
			{
				System.out.print(c[i]);
			}
		}


	}

}
