package com.sgtesting.day6;

public class A1Devenfor {

	public static void main(String[] args) {
		//1.make sure we can display even numbers b/w 20 to 40
		//2.decide size of array(when unknown)
		int s=0;
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				s=s+1;
			}
		}
		System.out.println();
		System.out.println(s+" is the size of the array");
		System.out.println();

		//3.assign even numbers to 1D array
		int a[]=new int[s];
		int k=0;
		for(int j=20;j<=40;j++)
		{
			if(j%2==0) 
			{
				a[k]=j;
				//System.out.println(a[k]);--->gives o/p but still use seperate loop nly.
				k=k+1;
			}
		}

		//4.read the elements
		for(int z:a)// for each cant read elements in reverse
		{
			System.out.println(z);
		}


	}

}
