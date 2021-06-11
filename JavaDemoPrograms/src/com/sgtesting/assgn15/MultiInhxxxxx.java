
package com.sgtesting.assgn15;
abstract class SubclassObject
{
	abstract void EvenOROdd(int n);
	abstract void PositveOrNegative(int n);
	abstract void VowelOrNot(char n);
	void display() 
	{
		System.out.println("abstra super calss");
	}
}
abstract class SubclassObject1 extends SubclassObject
{
	void EvenOROdd(int n)
	{
		if(n%2==0)
		{
			System.out.println(+n+" is even");
		}
		else
		{
			System.out.println(n+" is Odd");
		}
	}
}	
class SubclassObject2 extends SubclassObject1
{
	void PositveOrNegative(int n)
	{
		if(n>=0)
		{
			System.out.println(+n+" is Positve");
		}
		else
		{
			System.out.println(n+" is Negative");
		}
	}
	void VowelOrNot(char n)
	 {
		 if((n=='a')||(n=='e')||(n=='i')||(n=='o')||(n=='u')||(n=='A')||(n=='E')||(n=='I')||(n=='O')||(n=='U'))
			{
				System.out.println(n+" is vowel");
			}
			else
			{
				System.out.println(n+" is consonent");
			}
	 }
}
public class MultiInhxxxxx 
{
	public static void main(String[] args)
	{
		SubclassObject2 obj=new SubclassObject2();
		obj.EvenOROdd(13);
		obj.PositveOrNegative(12);
		obj.display();
		char j='e';
		obj.VowelOrNot(j);
	}
}

