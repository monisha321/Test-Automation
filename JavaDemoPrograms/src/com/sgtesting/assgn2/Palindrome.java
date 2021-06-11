package com.sgtesting.assgn2;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("enter the number"+a);
		int temp,sum=0,r;
		temp=a;
		while(a>0)
		{
			r=a%10;
			sum=(sum*10)+r;
			a=a/10;
		}
		if(sum==temp)
		{
			System.out.println("the number is a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		s.close();
	}

}
