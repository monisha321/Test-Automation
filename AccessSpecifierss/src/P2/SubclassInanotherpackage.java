package P2;

import P1.Protection;

public class SubclassInanotherpackage extends Protection {
	public SubclassInanotherpackage()
	{
		System.out.println("sub class in another package");
		//System.out.println("default variable is "+a);//default access specifier is package private
		//System.out.println("private variable is "+name);
		System.out.println("public variable is "+b);
		System.out.println("protected variable is "+c);
		System.out.println("+++++++++++++++++++++++++++++++++++");
	}
}
