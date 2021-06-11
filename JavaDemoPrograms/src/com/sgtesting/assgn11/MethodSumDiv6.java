package com.sgtesting.assgn11;
class Sum1//sum of numbers divisible by 6 from 1 to 100
{
	void div6()
	{
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%6==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("the sum is "+sum);

	}
}
public class MethodSumDiv6 {

	public static void main(String[] args) {
		Sum1 o=new Sum1();
		o.div6();


	}

}
