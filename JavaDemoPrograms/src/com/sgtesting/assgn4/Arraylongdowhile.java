package com.sgtesting.assgn4;

public class Arraylongdowhile {

	public static void main(String[] args) {
		long a[]= {100,32767,300};
		int i=0;
		do
		{
			System.out.println(a[i]);
			i=i+1;
		}while(i<a.length);
	}

}
