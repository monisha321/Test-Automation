package com.sgtesting.assgn13;
class Digit
{
	static void display(int n)
	{
		if ((n>=0)&&(n<=9))
		{
			System.out.println(n+" has 1 digit");
		}
		else if((n>=10)&&(n<=99))
		{
			System.out.println(n+" has 2 digits");
		}
		else if((n>=100)&&(n<=999))
		{
			System.out.println(n+" has 3 digits");
		}
		else 
		{
			System.out.println(n+" has more than 3 digits");
		}
		//return n;-- used when int datataype is used in static method 
	}
}
public class Digitsret {

	public static void main(String[] args) {
		Digit.display(123);
	}

}
