package com.sgtesting.day11;

public class MethodOverloading {//core purpose of methodoverloading is extracting substring from given string
//thrfr instead of writing different names for substring ,it is controlled by using different parameters ,range and position
	public static void main(String[] args) {
		String s="program";//(program=0123456)-- places
		
		String s1=s.substring(3);//o/p=gram
		System.out.println(s1);
		
		String s2=s.substring(3, 5);//o/p=gr
		System.out.println(s2);
		
	
	}

}
