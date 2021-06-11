package com.sgtesting.day4;
import java.util.Scanner;
public class PositiveornegativeTakeinput {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("enter the integer");
		int a=x.nextInt();
		if (a>0)
		{
			System.out.println(a+" is a positive number");
		}
		else if (a<0)
		{
			System.out.println(a+" is a negative number");
		}
		else
		{
			System.out.println(a+" is zero");
		}
		x.close();
	}

}
