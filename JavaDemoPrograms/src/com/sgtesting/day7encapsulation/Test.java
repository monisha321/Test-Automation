package com.sgtesting.day7encapsulation;

public class Test {

	public static void main(String[] args) {
		int a=Privateconstructor.price; 
		System.out.println(a);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		Test1.sum();
		Test1.sum();
		//static block runs only once i.e., for the first time when the class is called
	}

}
