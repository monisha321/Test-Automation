package com.sgtesting.assgn5;

public class Tablesdowhile {

	public static void main(String[] args) {
		int n=1,a;
		do
		{
			for(a=1;a<=10;a++)
			{
				System.out.println(n+"*"+a+"="+(a*n));
			}
			n=n+1;
		}while(n<=20);
		

	}

}
