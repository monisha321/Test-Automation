package com.sgtesting.assgn13;
class Squareret
{
	static int display(int s)
	{
		int i;//can provide int s=0 here also.
		for(int x=1;x<=10;x++) 
		{
			i=(x*x);
			s=s+i;
		}
		System.out.println("sum of square of 1st 10 numbers is: "+s);
		return s;
	}
}
public class SumofSquareStaticRet {

	public static void main(String[] args) {
		Squareret.display(0);
	}

}
