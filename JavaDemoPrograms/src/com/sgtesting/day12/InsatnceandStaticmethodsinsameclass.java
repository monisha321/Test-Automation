package com.sgtesting.day12;
/*RULE 1.instance members of  class1 can be called in  class2
   through objects created for  class1 in class2 and that of class2 in class1 .
   RULE 2.in the same class,one instance method or constructor can be called in another instance
   member directly.
   
   RULE 3. one static method can be accessed directly in another
   static method ,in the same class.
   RULE 4.static methods of one class can be accessed in another class static method
   using 'classname.staticmethodname'
   
   RULE 5. instance method cant be called directly in static method of the same class,
   object must be created for instance method.
   RULE 6.static method can be called in instance method of the same class becoz 
   all static members are class level
   
   RULE 7.to access instance method in the constructor of same class object must be created,
   to access static method in the constructor of same class 'classname.staticmethodname' must be used
		
 */
class Demo1
{
	Demo1()
	{
		addition(20,30);//RULE 2
		multiply(3,4);//RULE 2
	}
	void addition(int x,int y)//instance method
	{
		System.out.println("addition res is:"+(x+y));
	}
	void multiply(int x,int y)
	{
		addition(2,3);//RULE 2
		System.out.println("multiplication res is:"+(x*y));
	}
}
class Demo2
{
	Demo2()
	{
		subtraction(20,30);//RULE 2
		division();//RULE 2
	}
	int subtraction(int x,int y)//instance method
	{
		division();//RULE 2
		//int res=(x-y);
		System.out.println("addition res is:"+(x-y));
		return (x-y);
		
	}
	void division()
	{
		subtraction(3,2);
		int a=this.subtraction(10, 20);
		int b=2;
		System.out.println("multiplication res is:"+(a/b));
	}
}
class Demo3
{
	Demo3()
	{
		subtraction(20,30);//RULE 2
		division(3,4);//RULE 2
		add();
	}
	static void subtraction(int x,int y)//static method
	{
		Demo2 obj=new Demo2();
		obj.subtraction(20, 3);
		obj.division();
		int a=obj.subtraction(20, 30);
		//int b=obj.division();//throws error - void div cant be converted to int type
		int b=obj.subtraction(3, 4);
		System.out.println(a-b);
		
		Demo4.addition(5, 6);//RULE 4
		division(4,2);//RULE 3
		System.out.println("addition res is:"+(x-y));
	}
	static void division(int x,int y)
	{
		add();
		System.out.println("multiplication res is:"+(x/y));
	}
	static void add()
	{
		//int a=this.division(3,6);//this cant be used here becoz div is static method
		//int a=division(3,6);--->doesnt work
	}
}
class Demo4
{
	Demo4()
	{
		addition(20,30);//RULE 2
		multiply(3,4);//RULE 2
	}
	static void addition(int x,int y)//static method
	{
		Demo5 obj=new Demo5();
		obj.addition(20, 30);
		System.out.println("addition res is:"+(x+y));
	}
	static void multiply(int x,int y)
	{
		Demo3.division(10, 5);//RULE 4
		addition(2,3);//RULE 3
		System.out.println("multiplication res is:"+(x*y));
	}
}

class Demo5
{
	Demo5()
	{
		addition(20,30);
		multiply(3,4);
	}
	
	 void addition(int x,int y)//instance method
	{
		 multiply(4,2);//RULE 6
		System.out.println("addition res is:"+(x+y));
	}
	static void multiply(int x,int y)
	{
		Demo3.division(10, 5);//RULE 4
		Demo5 obj=new Demo5();
		obj.addition(20, 30);
		//addition(2,3);//instance method cant b called directly in static method,needs object creation
		System.out.println("multiplication res is:"+(x*y));
	}
}

public class InsatnceandStaticmethodsinsameclass {//instance methods cant be called in the static methods directly ,needs object creation

	public static void main(String[] args) {
		
	}

}
