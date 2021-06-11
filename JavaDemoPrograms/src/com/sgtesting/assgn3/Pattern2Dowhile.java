package com.sgtesting.assgn3;

public class Pattern2Dowhile {

	public static void main(String[] args) {
/*# 
# # 
# # # 
# # # # */
		int i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print("#"+" ");
				k=k+1;
			}while(k<=i);
			System.out.println();
			i=i+1;
		}while(i<=4);

	}

}
