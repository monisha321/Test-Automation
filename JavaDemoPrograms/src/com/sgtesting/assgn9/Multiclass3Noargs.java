package com.sgtesting.assgn9;

class Bird
{
	String name;
	int wings;
	int lifespan;
	String color;
	Bird()
	{
		color="black";
		lifespan=10;
		name="crow";
		wings=2;
		System.out.println("bird name is: "+name);
		System.out.println("lifespan is: "+lifespan);
		System.out.println("color : "+color);
		System.out.println("no of wings is: "+wings);
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println();

	}
}
class Animal
{
	String name;
	String lifespan;
	String diet;
	String color;
	Animal()
	{
		color="brown";
		diet="carnivore";
		lifespan="30 yrs";
		name="lion";
		System.out.println("animal name is :"+name);
		System.out.println("color is: "+color);
		System.out.println("lifespan is :"+lifespan);
		System.out.println("diet is :"+diet);
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println();

	}
}
class Fruit
{
	String color;
	String sname;
	String shape;
	String taste;
	Fruit()
	{
		color="orange";
		shape="round";
		sname="orange";
		taste="sweet-sour";
		System.out.println("name :"+ sname);
		System.out.println("color: "+color);
		System.out.println("shape is :"+shape);
		System.out.println("taste: "+taste);
	}
}
public class Multiclass3Noargs {

	public static void main(String[] args) {
		Bird s=new Bird();
		
		Animal l=new Animal();
		
		Fruit S=new Fruit();
		

	}

}
