import P1.IndependentclassInsamepackage;
import P1.Protection;
import P1.SubclassINsamepackage;
import P2.IndependentclassInanotherpackage;
import P2.SubclassInanotherpackage;

//example to demonstrate  execution of access specifiers in different packages and classes 

public class Maindemo {//main method created in a differnt package(just for demonstration) to execute the parent/reference class protection

	public static void main(String[] args) {
		//Protection obj=new Protection();
		//SubclassINsamepackage obj1=new SubclassINsamepackage();//also provides o/p of protection class constructor
		//IndependentclassInsamepackage obj2 =new IndependentclassInsamepackage();//also provides o/p of protection class constructor
		//SubclassInanotherpackage obj3=new SubclassInanotherpackage();//also provides o/p of protection class constructor
		IndependentclassInanotherpackage obj4=new IndependentclassInanotherpackage();
	}

}
