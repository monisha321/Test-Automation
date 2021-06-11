package com.sgtesting.day4;
import java.util.Scanner;
public class TakeBooleaninput {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter boolean value");
		boolean x=a.nextBoolean();
		System.out.println("user input is"+x);
		a.close();
		
	}

}
