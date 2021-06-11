package com.sgtesting.RegularExpressiondemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpession1 {

	public static void main(String[] args) {
		matchesdemo();
		finddemo();
		findemo();
		findemo1();
		findemo12();
		findemo123();
		findemo1234();

	}
	static void matchesdemo()
	{
		Pattern obj=Pattern.compile("java");
		Matcher match=obj.matcher("java");
		boolean val=match.matches();
		System.out.println(val);
		System.out.println("++++++++++++++++++++++");
	}
	
	static void finddemo()
	{
		Pattern obj=Pattern.compile("java");
		Matcher match=obj.matcher("java JAVA jre JVM");
		boolean val=match.matches();
		System.out.println(val);
		System.out.println("-------------------");
		boolean val1=match.find();
		System.out.println(val1);
		System.out.println("+++++++++++++++++++++");
	}
	
	static void findemo()
	{
		Pattern obj=Pattern.compile("java");
		Matcher match=obj.matcher("java  java JAVA  java jre JVM");
		int count=0;
		while(match.find())
		{
			count++;
		}
		
		System.out.println(count);
		System.out.println("++++++++++++++++++++++++++++");
		
	}
	static void findemo1()
	{
		Pattern obj=Pattern.compile("java");
		Matcher match=obj.matcher("java  java JAVA  java jre JVM");
		
		while(match.find())
		{
			System.out.println(match.group());
			
		}
		System.out.println("+++++++++++++++++++++++++++");
	}
	
	static void findemo12()
	{
		Pattern obj=Pattern.compile("java");
		Matcher match=obj.matcher("java  java JAVA  java jre JVM");
		
		while(match.find())
		{
			System.out.println(match.start()+"------->"+match.end());
			
		}
		System.out.println("+++++++++++++++++++++++");
		
	}
	static void findemo123()
	{
		Pattern obj=Pattern.compile("java");
		Matcher match=obj.matcher("java  java JAVA  java jre JVM");
		
		String s=match.replaceAll("python");
		
		System.out.println(s);
		System.out.println("++++++++++++++++++++++++++");
		
	}
	static void findemo1234()
	{
		Pattern obj=Pattern.compile("[!@#$%^&*]");
		String s1="apple!mango@banana#fruit$";
		
		String s[]=obj.split(s1);
		for(String s2:s)
		{
		System.out.println(s2);
		}
		
	}
	
}
