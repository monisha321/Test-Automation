package com.sgtesting.assgn12;
class Addret
{
	int[] MatAdd(int a[],int b[])
	{
		int c[]= new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
		}
		return c;
	}
}
public class Add1DRet {

	public static void main(String[] args) {
		
		Addret s=new Addret();
		int p[]= {1,2,3};
		int q[]= {4,5,6};
		int res[]= s.MatAdd(p,q);

		for(int r=0;r<res.length;r++)
		{
			System.out.print(res[r]+" ");
		}
		System.out.println();

	}

}
