package P1;

public class Protection {//parent class
	 int   a=10;
	private String name="rahul";
	public int b=12;
	protected int c=23;
	
	public Protection()
	{
		System.out.println("Protection class constructor");
		System.out.println("default variable is "+a);
		System.out.println("private variable is "+name);
		System.out.println("public variable is "+b);
		System.out.println("protected variable is "+c);
		System.out.println("+++++++++++++++++++++++++++++++++++");
	}

}
