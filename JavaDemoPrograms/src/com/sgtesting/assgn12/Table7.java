package com.sgtesting.assgn12;
class Table
{
	int[] display()
	{
		
		int c[]=new int[10];
		int k=0;
		for (int a=1;a<=10;a++)
		{
			c[k]=(7*a);
			k=k+1;
		}
		return c;
	}
}
public class Table7 {

	public static void main(String[] args) {
		Table t=new Table();
		int p[]=t.display();
		for(int q=0;q<p.length;q++)
		{
			System.out.println(p[q]);
		}
	}

}
