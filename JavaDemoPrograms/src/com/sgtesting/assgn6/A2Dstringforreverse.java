package com.sgtesting.assgn6;

public class A2Dstringforreverse {

	public static void main(String[] args) {
		String s[][]= {{"flower","bee"},{"boat","river"}};
		for(int i=(s.length-1);i>=0;i--)
		{
			for(int j=(s[i].length-1);j>=0;j--)
			{
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}

	}

}
