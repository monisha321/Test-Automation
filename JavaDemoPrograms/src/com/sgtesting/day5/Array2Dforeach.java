package com.sgtesting.day5;

public class Array2Dforeach {

	public static void main(String[] args) {
		int a[][]= {{20,22,23},{45,67,76},{1,2,3}};
		
		for(int kk[]:a)
		{
			for(int b:kk)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}

	}

}
