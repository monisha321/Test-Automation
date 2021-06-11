package com.sgtesting.day4;
import java.util.Scanner;
public class TakeINTinput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer");
		int a=sc.nextInt();
		System.out.println("user input:"+a);
		sc.close();
	}

}
