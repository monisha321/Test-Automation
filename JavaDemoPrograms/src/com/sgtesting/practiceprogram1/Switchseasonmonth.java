package com.sgtesting.practiceprogram1;

public class Switchseasonmonth {

	public static void main(String[] args) {

String x="abc";
switch (x)
{
case "nov": case "december": case "january": case "febraury":
System.out.println("winter");
break;

case "mar": case "apr": case "may":
System.out.println("summer");
break;

case "june": case "july": case "aug":case "sept":
System.out.println("rainy");
break;

default:
System.out.println("invalid month");
}

	}

}
