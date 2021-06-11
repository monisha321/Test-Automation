package com.sgtesting.assgn12;
class Stringarr
{
	String[][] Mat()
	{
		String a[][]= {{"river","forest"},{"fog","dew"}};
		return a;
	}
}
public class StringMatRet {

	public static void main(String[] args) {
		Stringarr s=new Stringarr();
		String c[][]=s.Mat();
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
