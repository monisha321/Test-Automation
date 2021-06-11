package com.sgtesting.assgn8;
class Twowheelers
{
	String bikename;//instance variables
	int price;
	String fuel;
	String engine;
	String color;
}
class Fourwheelers
{
	String carname;
	String fuel;
	String engine;
	int price;
	String color;
}
public class Multiclass1 {

	public static void main(String[] args) {
		Twowheelers t=new Twowheelers();//creating object to access nd call the class members
		t.bikename="yamaha";//assigning values to the class instance variables
		t.price=25000;
		t.fuel="petrol";
		t.engine="125cc";
		t.color="black";
		System.out.println("bikename is :"+t.bikename);
		System.out.println("price is "+t.price);
		System.out.println("fuel used is "+t.fuel);
		System.out.println("engine : "+t.engine);
		System.out.println("color is: "+t.color);
		System.out.println("++++++++++++++++++++++++++++");

		Fourwheelers f=new Fourwheelers();
		f.carname="audi";
		f.color="black";
		f.engine="double engine";
		f.fuel="diesel";
		f.price=4000000;
		System.out.println("carname is:"+f.carname);
		System.out.println("price is :"+f.price);
		System.out.println("fuel used is: "+f.fuel);
		System.out.println("engine : "+f.engine);
		System.out.println("color is: "+f.color);


	}

}
