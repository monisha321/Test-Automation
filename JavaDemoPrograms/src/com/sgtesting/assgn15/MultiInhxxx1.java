package com.sgtesting.assgn15;
abstract class SubclassObject01
{
	SubclassObject01(int a,String name)
	{
		System.out.println(a+")"+name);
	}
	abstract void EvenOROdd(int n);
	abstract void PositveOrNegative(int n);
	abstract void VowelOrNot(char n);
	void display() 
	{
		System.out.println("abstra super calss");
	}
}
abstract class SubclassObject02 extends SubclassObject01
{
	SubclassObject02(int a,String name)
	{
		super(a,name);
	}
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
class SubclassObject03 extends SubclassObject02
{
	SubclassObject03(int a,String name)
	{
		super(a,name);
	}
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
				System.out.println(+n+" is vowel");
			}
			else
			{
				System.out.println(n+" is consonent");
			}
	 }
}
public class MultiInhxxx1 {//DParameterizedConstructorInAbstractSuperClass

	public static void main(String[] args) {
		SubclassObject03 obj=new SubclassObject03(1,"santhos");
		obj.display();
		obj.EvenOROdd(14);
		obj.PositveOrNegative(4);
		obj.VowelOrNot('r');
	}

}
