package com.sgtesting.assgn12;
class Even
{
	boolean iseven(int i)//can use any other variable also instead of i
	{
		if(i%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	void displayeven()
	{
		for(int i=20;i<=40;i++)
		{
			if(iseven(i)==true)
			{
				System.out.println(i);
			}
		}
	}
}
public class EvenRet {

	public static void main(String[] args) {
		Even e=new Even();
		e.displayeven();

	}

}
