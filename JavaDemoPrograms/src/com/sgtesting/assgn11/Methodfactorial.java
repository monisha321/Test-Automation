package com.sgtesting.assgn11;

class Fact
{
	void fact(int j)
	{
		int z=1;
		for(int i=1;i<=j;i++)
		{
			z=z*i;
		}
		System.out.println("factorial of "+j+" is "+z);
		
	}
}
public class Methodfactorial {

	public static void main(String[] args) {
		Fact f=new Fact();
		f.fact(10);
		//System.out.println(f.fact(10)); //cant provide o/p statement here shows error
	}

}

/* return method 
 class Fact
{
	int fact(int j)
	{
		int z=1;
		for(int i=1;i<=j;i++)
		{
			z=z*i;
		}
		System.out.println("factorial of "+j+" is "+z);
		return z;
	}
}
public class Methodfactorial {

	public static void main(String[] args) {
		Fact f=new Fact();
		f.fact(10);
		System.out.println("factorial of number is "+f.fact(10));
	}

}*/
 