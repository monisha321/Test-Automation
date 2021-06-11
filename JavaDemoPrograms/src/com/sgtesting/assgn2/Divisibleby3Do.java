package com.sgtesting.assgn2;

public class Divisibleby3Do {

	public static void main(String[] args) {
		int i=1;
		do
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
			i=i+1;
		}while(i<=50);
	}

}
