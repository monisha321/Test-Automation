package com.sgtesting.assgn8;

class Bird
{
	String name;
	int wings;
	int lifespan;
	String color;
}
class Animal
{
	String name;
	String lifespan;
	String diet;
	String color;
}
class Fruit
{
	String color;
	String sname;
	String shape;
	String taste;
}
public class Multiclass4 {

	public static void main(String[] args) {
		Bird s=new Bird();
		s.color="black";
		s.lifespan=10;
		s.name="crow";
		s.wings=2;
		System.out.println("bird name is: "+s.name);
		System.out.println("lifespan is: "+s.lifespan);
		System.out.println("color : "+s.color);
		System.out.println("no of wings is: "+s.wings);
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println();

		Animal l=new Animal();
		l.color="brown";
		l.diet="carnivore";
		l.lifespan="30 yrs";
		l.name="lion";
		System.out.println("animal name is :"+l.name);
		System.out.println("color is: "+l.color);
		System.out.println("lifespan is :"+l.lifespan);
		System.out.println("diet is :"+l.diet);
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println();

		Fruit S=new Fruit();
		S.color="orange";
		S.shape="round";
		S.sname="orange";
		S.taste="sweet-sour";
		System.out.println("name :"+ S.sname);
		System.out.println("color: "+S.color);
		System.out.println("shape is :"+S.shape);
		System.out.println("taste: "+S.taste);

	}

}
