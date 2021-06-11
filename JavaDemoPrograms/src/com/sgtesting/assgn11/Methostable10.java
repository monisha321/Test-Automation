package com.sgtesting.assgn11;
class Table10
{
	void Table10(int a)//method name can be class/constructor name .works fine.
	{

		for(int i=1;i<=a;i++)
		{
			System.out.println("10*"+i+"="+i*10);

		}

	}
}
public class Methostable10 {

	public static void main(String[] args) {
		Table10 t=new Table10();
		t.Table10(10);

	}

}
