package com.sgtesting.assgn6;

public class A2Dstringfor {

	public static void main(String[] args) {
		String s[][]= {{"king","queen"},{"prince","princess"}};
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}

	}

}
