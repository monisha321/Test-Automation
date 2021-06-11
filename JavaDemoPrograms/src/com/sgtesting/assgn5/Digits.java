package com.sgtesting.assgn5;

public class Digits {

	public static void main(String[] args) {
		int n=127;
		if ((n>=0)&&(n<=9))
		{
			System.out.println(n+" has 1 digit");
		}
		else if((n>=10)&&(n<=99))
		{
			System.out.println(n+" has 2 digits");
		}
		else if((n>=100)&&(n<=999))
		{
			System.out.println(n+" has 3 digits");
		}
		else 
		{
			System.out.println(n+" has more than 3 digits");
		}
	}

}
