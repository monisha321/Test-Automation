package com.sgtesting.assgn11;
class Vowel
{
	void dispaly(char ch)
	{
		if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
		{
			System.out.println("the alphabet is vowel");
		}
		else
		{
			System.out.println("the alphabet is consonant");
		}
	}
}
public class Methodvowel {

	public static void main(String[] args) {
		Vowel v=new Vowel();
		v.dispaly('A');

	}

}
