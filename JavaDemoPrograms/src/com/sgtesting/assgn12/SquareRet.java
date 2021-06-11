package com.sgtesting.assgn12;
class Square
{
	int[] display()
	{
		int c[]=new int[10];
		int k=0;
		for(int j=1;j<=10;j++)
		{
			c[k]=j*j;
			k=k+1;
		}
		return c;
	}
}
public class SquareRet {

	public static void main(String[] args) {
		Square o=new Square();
		int q[]=o.display();
		
		for(int p=0;p<q.length;p++)
		{
			System.out.println(q[p]);
		}
	}

}
