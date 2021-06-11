package com.sgtesting.assgn5;

public class Sumofdigitsfor {

	public static void main(String[] args) {
		int sum=0;
		for(int n=6789;n!=0;n/=10)
		{
		sum=sum+(n%10);	
		}
		System.out.println(sum);	

	}

}
