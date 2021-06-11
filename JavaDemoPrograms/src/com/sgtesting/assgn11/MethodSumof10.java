package com.sgtesting.assgn11;
class Sum//sum of first 10 numbers
{
	void display(int a)
	{
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			sum=sum+i;
		}

		System.out.println(sum);
	}

}
public class MethodSumof10 {

	public static void main(String[] args) {
		Sum s=new Sum();
		s.display(10);

	}

}
