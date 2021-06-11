package com.sgtesting.assgn17;

public class StringDelete {

	public static void main(String[] args) {
		deleteString();
		
		}
static void deleteString()
{
	String s1="sundaymondaytuesdaywednesdaythursdayfriday";
	
	
	s1 = s1.join("", s1.split("day"));
	System.out.println(s1);
}
}
