package com.sgtesting.assgn5;

public class Fibonaccidowhile {

	public static void main(String[] args) {
		int a=0,b=1,c;
		System.out.print(a+" "+b);
		int n=2;
		do
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			n=n+1;
		}while(n<10);

	}

}
