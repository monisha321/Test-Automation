package com.sgtesting.assgn13;
class RevNo
{
	static int display(int a)
	{
		int r,sum=0;
		while(a>0)
		{
			r=a%10;
			sum=(sum*10)+r;
			a=a/10;
		}
		System.out.println("reverse of the no is  "+sum);
		return a;
	}
}
public class Reversenoret {

	public static void main(String[] args) {
		RevNo.display(123);
	}

}
