package com.sgtesting.assgn6;

public class A2Dcharwhile {

	public static void main(String[] args) {
		char ch[][]= {{'4','l'},{'y','8'}};
		int i=0;
		while(i<ch.length)
		{
			int j=0;
			while(j<ch[i].length)
			{
				System.out.print(ch[i][j]+" ");
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}

	}

}
