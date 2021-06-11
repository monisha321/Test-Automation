package com.sgtesting.day11;
class Ref
{
	int a,b;//instance variables==to access these in main method,it needs an object
	void calculate(Ref obj)//datatype of object is class name
	{
		obj.a+=100;
		obj.b*=9;
		System.out.println("within method value of a is "+a);
		System.out.println("within method value of b is "+b);
	}
}
public class CallByReference {//o/p of method can be called in the main method

	public static void main(String[] args) {
		Ref obj=new Ref();
		obj.a=10;//cant access and assign values to a,b directly becoz thy r instance variables
		obj.b=20;
		System.out.println("before execution of method value of a is "+obj.a);
		System.out.println("before execution of method value of b is "+obj.b);
		
		obj.calculate(obj);
		
		System.out.println("after execution of method value of a is "+obj.a);//gives same o/p as that of method
		System.out.println("after execution of method value of b is "+obj.b);
		
		

	}

}
/* GIVES SAME O/P
package com.sgtesting.day11;
class Ref
{
	int a,b;//instance variables==to access these in main method,it needs an object
	void calculate()
	{
		a+=100;
		b*=9;
		System.out.println("within method value of a is "+a);
		System.out.println("within method value of b is "+b);
	}
}
public class CallByReference {//o/p of method can be called in the main method

	public static void main(String[] args) {
		Ref obj=new Ref();
		obj.a=10;//cant access and assign values to a,b directly becoz thy r instance variables
		obj.b=20;
		System.out.println("before execution of method value of a is "+obj.a);
		System.out.println("before execution of method value of b is "+obj.b);
		
		obj.calculate();
		System.out.println("after execution of method value of a is "+obj.a);//gives same o/p as that of method
		System.out.println("after execution of method value of b is "+obj.b);
		
		

	}

}
*/