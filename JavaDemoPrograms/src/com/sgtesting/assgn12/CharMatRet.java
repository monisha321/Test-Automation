package com.sgtesting.assgn12;
class Chararr
{
	char[][] Mat()
	{
		char a[][]= {{'r','f'},{'j','k'}};
		return a;
	}
}
public class CharMatRet {

	public static void main(String[] args) {
		Chararr s=new Chararr();
		char c[][]=s.Mat();
		for (int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}


	}

}