package com.sgtesting.assgn2;

public class EvenDo {

	public static void main(String[] args) {
		int i=1;
		do
		{
			if(i%2==0) {
				System.out.println(i);	
			}
			i=i+1;
		}while(i<=10);
	}

}
