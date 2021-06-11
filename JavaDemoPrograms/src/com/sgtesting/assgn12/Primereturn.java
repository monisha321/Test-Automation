package com.sgtesting.assgn12;
class Prime
{

	boolean isprime(int n)//method for returning true or false by checking  prime
	{
		int flag=0;//important ,must b within method
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag+=1;
				break;//imp
			}
		}
		if (flag==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	void displayprime()//calls boolean method return values to verify prime nos from 1 to 50
	{
		
		for(int  i=1;i<=50;i++)

		{
			if(isprime(i)==true)
			{
				System.out.println(i);
			}
		}
		//return i;
	}
}

public class Primereturn {

	public static void main(String[] args) {
		Prime p=new Prime();
		p.displayprime();
	

	}

}
/* SAME OUTPUT
package com.sgtesting.assgn12;
class Prime
{

	boolean isprime(int n)//method for returning true or false by checking whether prime
	{
		int flag=0;//important ,must b within method
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag+=1;
				break;//imp
			}
		}
		if (flag==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	int displayprime(int i)//calls boolean method return values to verify prime nos from 1 to 50
	{
		for(  i=1;i<=50;i++)

		{
			if(isprime(i)==true)
			{
				System.out.println(i);
			}
		}
		return i;
	}
}

public class Primereturn {

	public static void main(String[] args) {
		Prime p=new Prime();
		p.displayprime(0);
	

	}

}
*/