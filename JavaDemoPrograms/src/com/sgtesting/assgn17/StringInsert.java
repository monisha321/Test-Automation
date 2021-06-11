package com.sgtesting.assgn17;

public class StringInsert {

	public static void main(String[] args) {
		appendString();
	}

	static void appendString()
	{
		String s="SundayMondayTuesdayWednesdayThursday";
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i++) 
		{

			result.append(s.charAt(i));
			if (i != s.length() -1 && Character.isUpperCase((s.charAt(i + 1))))
			{
				result.append(",");
			}
		}
		System.out.println(result);
	}


}

