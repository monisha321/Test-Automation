package com.sgtesting.day3;

public class Continuewhile {

	public static void main(String[] args) {
		int i=1;
		while(i<=20)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
			i=i+1;
		}

	}

}
