package com.sgtesting.assgn6;

public class A2Dstringdowhile {

	public static void main(String[] args) {
		String s[][]= {{"king","queen"},{"prince","princess"}};
		int i=0;
		do
		{
			int j=0;
			do
			{
				System.out.print(s[i][j]+" ");
				j=j+1;
			}while(j<s[i].length);
			System.out.println();
			i=i+1;
		}while(i<s.length);

	}

}
