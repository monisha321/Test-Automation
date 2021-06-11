package com.sgtesting.assgn13;
class Prime
{
	static int display()
	{
		int s=0;
		for(int i=1;i<=50;i++)
		{
			int flag=0;
			for(int n=2;n<i;n++)
			{
				if(i%n==0)
				{
					flag+=1;
					break;
				}
			}

			if(flag==0)
			{
				s=s+1;
			}
		}

		System.out.println("size of array is "+s);

		return s;
	}	
	static int[] display1()
	{
		int k=0;
		int a[]=new int[Prime.display()];
		for(int i=1;i<=50;i++)
		{
			int f=0;
			for(int n=2;n<i;n++)
			{
				if(i%n==0)
				{
					f+=1;
					break;
				}
			}
			if(f==0)
			{
				a[k]=i;
				//System.out.println(a[k]);
				k=k+1;
			}
		}
		return a;
	}

}

public class Primeret {

	public static void main(String[] args) {
		Prime.display();
		Prime.display1();

		int b[]=Prime.display1();
		for(int j=0;j<b.length;j++)
		{
			System.out.println(b[j]);
		}
	}

}
