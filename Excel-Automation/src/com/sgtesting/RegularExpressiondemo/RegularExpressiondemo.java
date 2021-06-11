package com.sgtesting.RegularExpressiondemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressiondemo {

	public static void main(String[] args) {
		regexp1();
		regexp2();
		regexp3();
	}
	static void regexp1()
	{
		Pattern obj=Pattern.compile("[0-9]");
		Matcher match=obj.matcher("java ia a  1 st pgmng lnge");
		boolean val=match.find();
		System.out.println(val);
		
		Pattern obj1=Pattern.compile("[0-9][0-9]");
		Matcher match1=obj1.matcher("java ia a  17 st pgmng lnge");
		boolean val1=match1.find();
		System.out.println(val1);
	}
	static void regexp2()
	{
		Pattern obj=Pattern.compile("[0-9]{1}");
		Matcher match=obj.matcher("java ia a  1 st pgmng lnge");
		String s=match.replaceFirst("one");
		System.out.println(s);
		
		Pattern obj1=Pattern.compile("[0-9]{3}");
		Matcher match1=obj1.matcher("java ia a  123 st pgmng lnge");
		String s1=match1.replaceFirst("one");
		System.out.println(s1);
	}
	static void regexp3()
	{
		Pattern obj=Pattern.compile("[a-z]+");
		Matcher match=obj.matcher("java ia a  1 st pgmng lnge");
		while(match.find())
		{
			System.out.println(match.group());
		}
		
	}
}
