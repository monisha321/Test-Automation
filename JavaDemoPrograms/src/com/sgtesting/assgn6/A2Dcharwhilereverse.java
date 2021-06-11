package com.sgtesting.assgn6;

public class A2Dcharwhilereverse {

	public static void main(String[] args) {
		char ch[][]= {{'4','l'},{'y','8'}};
		int i=(ch.length-1);
		while(i>=0)
		{
			int j=(ch[i].length-1);
			while(j>=0)
			{
				System.out.print(ch[i][j]+" ");
				j=j-1;
			}
			System.out.println();
			i=i-1;
		}

	}

}
