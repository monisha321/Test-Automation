package com.sgtesting.practiceday2;

public class WhileReverse {// 1 to 20 odd numbers in reverse

	public static void main(String[] args) {
		int i=20;
		while(i>=1)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i=i-1;//important//
		}

	}

}
