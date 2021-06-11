package com.sgtesting.assignment1;

public class SumDivisible4 {//sum of numbers divisible by 4 from 1 to 50

	public static void main(String[] args) {
		int x=0;
		for(int i=1;i<=50;i++)
		{
			if(i%4==0)
			{
				x=x+i;
			}

		}
		System.out.println(x);

	}

}


