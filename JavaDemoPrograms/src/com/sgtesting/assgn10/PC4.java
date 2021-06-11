package com.sgtesting.assgn10;

class Bird
{
	String name;
	int wings;
	int lifespan;
	String color;
	Bird(String n,int w,int l,String c)
	{
		this.color=c;
		this.lifespan=l;
		this.name=n;
		this.wings=w;
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
	Animal(String n,String l,String d,String c)
	{
		this.color=c;
		this.diet=d;
		this.lifespan=l;
		this.name=n;
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
	Fruit(String c,String n,String s,String t)
	{
		this.color=c;
		this.shape=s;
		this.sname=n;
		this.taste=t;
		System.out.println("name :"+ sname);
		System.out.println("color: "+color);
		System.out.println("shape is :"+shape);
		System.out.println("taste: "+taste);
	}
}
public class PC4 {

	public static void main(String[] args) {
		Bird s=new Bird("crow",2,10,"black");
		Bird s1=new Bird("sparrow",2,10,"brown");
		
		Animal l=new Animal("lion","20yrs","carnivore","brown");
		Animal l1=new Animal("dog","20yrs","carnivore","brown");
		
		Fruit S=new Fruit("orange","orange","round","sweet");
		Fruit S1=new Fruit("red","apple","round","sweet");
		

	}

}
