package com.sgtesting.assgn11;
class TabRev
{
	void display()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println("8*"+i+"="+i*8);
		}

	}
}
public class MethodTablerev {

	public static void main(String[] args) {
		TabRev t=new TabRev();
		t.display();

	}

}
