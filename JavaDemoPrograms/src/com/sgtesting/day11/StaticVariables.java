package com.sgtesting.day11;
//if static variables are available in main class

public class StaticVariables {//main class
	static String firstname;//static variables(it is of main class level)
	static int age;
	
	public static void main(String[] args) {// main method is a static method
		firstname="raj";//static variables can be accessed directly in the main method which is a static method
		age=28;
		System.out.println("firstname:"+firstname);
		System.out.println("age "+age);
		System.out.println("+++++++++++++");
		
		firstname="dravid";
		age=30;
		System.out.println("firstname:"+firstname);
		System.out.println("age "+age);
	}

}
