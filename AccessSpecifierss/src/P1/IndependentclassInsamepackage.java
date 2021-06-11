package P1;

public class IndependentclassInsamepackage {//independent class does not extend parent class
	Protection obj=new Protection();//needs object to access parent class
	public IndependentclassInsamepackage()
	{
		System.out.println("independent class in same package");
		System.out.println("default variable is "+obj.a);
		//System.out.println("private variable is "+obj.name);
		System.out.println("public variable is "+obj.b);
		System.out.println("protected variable is "+obj.c);
		System.out.println("+++++++++++++++++++++++++++++++++++");
	}
}
