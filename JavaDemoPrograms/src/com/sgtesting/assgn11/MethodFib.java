package com.sgtesting.assgn11;
class Fib
{
	void display(int a,int b)
	{
		int c=0;
		int k=0;
		int z[]=new int[10];
		System.out.print(a+" "+b+" ");
		for(int n=2;n<10;n++)
		{
			c=a+b;	
			//z[k]=c;
			//System.out.print(" "+z[k]);
			//k=k+1;
			System.out.print(c+" ");
			a=b;
			b=c;			
		}
	
		
	}
}
public class MethodFib {

	public static void main(String[] args) {
		Fib o=new Fib();
		o.display(0,1);
		
	}

}

/*return method
 package com.sgtesting.assgn11;
class Fib
{
	int display(int a,int b)
	{
		int c;
		System.out.print(a+" "+b+" ");
		for(int n=1;n<=8;n++)
		{
			c=a+b;		
			System.out.print(" "+c);
			a=b;
			b=c;			
		}
		return a;
	}
}
public class MethodFib {

	public static void main(String[] args) {
		Fib o=new Fib();
		o.display(0,1);
		//System.out.println(o.display(0, 1));//doesnt work becoz c keeps changing and is not stored anywhere,thrfr nly final c value will be returned 
//if we use matrix to i/p c values then v can use syso here.
	}

}

//return method using array
 class Fib
{
	int[] display(int a,int b)
	{
		int c=0;int k=0;
		int z[]=new int[10];
		System.out.print(a+" "+b+" ");
		for(int n=1;n<=8;n++)
		{
			c=a+b;	
			z[k]=c;
			//System.out.print(" "+z[k]);
			k=k+1;
			a=b;
			b=c;			
		}
	return z;
		
	}
}
public class MethodFib {

	public static void main(String[] args) {
		Fib o=new Fib();
		//o.display(0,1);
		int res[]=o.display(0, 1);
		for(int i=0;i<(res.length-2);i++)
		{
			System.out.print(res[i]+" ");
		}
	}

}*/
 