package com.sgtesting.assgn11;
class Prime//without return we cant print prime from 1 to 50 . but without return we can only check whether number is prime or not
{
	int size()
	{
		
		int s=0;
		for(int i=1;i<=50;i++)
		{
			int flag=0;//placement is important
			for(int n=2;n<i;n++) 
			{

				if(i%n==0)
				{
					flag+=1;
					break;
				}
			}
			if (flag==0)
			{
				s=s+1;
			}
		}
		System.out.println("size of array is "+s);
		return s;
	}
	void display()//you can make this as int return also and print o/p in main method
	{
		
		int k[]=new int[size()];
		int b=0;
		for(int j=1;j<=50;j++)
		{
			int flag=0;//placement is important
			for(int n=2;n<j;n++) 
			{

				if(j%n==0)
				{
					flag+=1;
					break;
				}
			}
			if (flag==0)
			{
				k[b]=j;
				System.out.print(k[b]+" ");
				b=b+1;
			}

		}

	}
}
	public class Methodprime {

		public static void main(String[] args) {
			Prime o=new Prime();
			o.display();

		}

	}
