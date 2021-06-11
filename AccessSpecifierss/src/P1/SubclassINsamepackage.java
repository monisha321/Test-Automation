package P1;

public class SubclassINsamepackage extends Protection {//can access protection class(reference/parent class directly
	
	public SubclassINsamepackage()
	{
		System.out.println("sub class in same package");
		System.out.println("default variable is "+a);
		//System.out.println("private variable is "+name);
		System.out.println("public variable is "+b);
		System.out.println("protected variable is "+c);
		System.out.println("+++++++++++++++++++++++++++++++++++");
	}
}
