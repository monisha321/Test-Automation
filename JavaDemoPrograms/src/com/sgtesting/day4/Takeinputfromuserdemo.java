package com.sgtesting.day4;
import java.util.Scanner;
public class Takeinputfromuserdemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input from console :");
		String s=sc.nextLine();
		System.out.println("the user input is :"+s);
		sc.close();

	}

}
