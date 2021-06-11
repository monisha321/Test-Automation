package com.sgtesting.assgn6;

public class A2Dstringwhilereverse {

	public static void main(String[] args) {
		String s[][]= {{"emily","blunt"},{"jay","amul"}};
		int i=(s.length-1);
		while(i>=0)
		{
			int j=(s[i].length-1);
			while(j>=0)
			{
				System.out.print(s[i][j]+" ");
				j=j-1;
			}
			System.out.println();
			i=i-1;
		}

	}

}
