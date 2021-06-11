package com.sgtesting.assgn17;

public class StringConsonant {

	public static void main(String[] args) {
		charAtStr();
	}
	static void charAtStr()
	{
		String s="java program";
		int count1=0;
		for(int i=(s.length()-1);i>=0;i--)
		{
			char ch=s.charAt(i);
			if((ch=='a')||(ch=='A')||(ch=='e')||(ch=='E')||(ch=='i')||(ch=='I')||(ch=='o')||(ch=='O')||(ch=='u')||(ch=='U'))
			{
				System.out.println();
			}
			else if(!Character.isSpaceChar(ch))
			{
				count1++;
			}
		}
		System.out.println("the count of consonants in the string is "+count1);



	}

}
