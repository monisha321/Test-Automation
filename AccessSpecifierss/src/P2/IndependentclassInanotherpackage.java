package P2;

import P1.Protection;

public class IndependentclassInanotherpackage {
	Protection obj=new Protection();//needs object to access parent class
	public IndependentclassInanotherpackage()
	{
		System.out.println("independent class in same package");
		//System.out.println("default variable is "+obj.a);
		//System.out.println("private variable is "+obj.name);
		System.out.println("public variable is "+obj.b);
		//System.out.println("protected variable is "+obj.c);//cant be accessed
		System.out.println("+++++++++++++++++++++++++++++++++++");
	}
}
