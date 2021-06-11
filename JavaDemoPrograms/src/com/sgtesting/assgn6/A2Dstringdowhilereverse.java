package com.sgtesting.assgn6;

public class A2Dstringdowhilereverse {

	public static void main(String[] args) {
		String s[][]= {{"emily","blunt"},{"jay","amul"}};
		int i=(s.length-1);
		do
		{
			int j=(s[i].length-1);
			do
			{
				System.out.print(s[i][j]+" ");
				j=j-1;
			}while(j>=0);
			System.out.println();
			i=i-1;
		}while(i>=0);

	}

}
