package com.sgtesting.practiceprogram1;

public class Switchdemo {

	public static void main(String[] args) {

char ch='e';
switch(ch)
{
case 'a':case 'A': case 'e':case'E':case 'o':case 'O':case 'i':case 'I':
System.out.println(ch+" is a vowel");
break;
case 'u':
System.out.println(ch+" is a vowel");
break;
default:
System.out.println(ch+" is a consonant");
}

	}

}
