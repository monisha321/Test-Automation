package com.sgtesting.assgn6;

public class A2Dstringwhile {

	public static void main(String[] args) {
		String s[][]= {{"king","queen"},{"prince","princess"}};
		int i=0;
		while(i<s.length)
		{
			int j=0;
			while(j<s[i].length)
			{
				System.out.print(s[i][j]+" ");
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}

	}

}
