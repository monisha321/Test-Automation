package com.sgtesting.assgn5;
import java.util.Scanner;
public class PrimenumberSCANNER {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int a= s.nextInt();
		
		int flag=0;
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				flag+=1;
				break;
			}
		}
		if (flag==0)
		{
			System.out.println(a+" is prime");
		}
		else
		{
			System.out.println(a+" is not prime");
		}
		s.close();
	}

}
