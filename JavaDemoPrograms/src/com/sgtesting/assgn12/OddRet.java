package com.sgtesting.assgn12;
class Odd
{
	boolean isodd(int n)
	{
		if(n%2!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	void displayodd()
	{
		for(int i=91;i>=41;i--)
		{
			if(isodd(i)==true)
			{
				System.out.println(i);
			}
		}
	}
}
public class OddRet {

	public static void main(String[] args) {
		Odd e=new Odd();
		e.displayodd();

	}

}