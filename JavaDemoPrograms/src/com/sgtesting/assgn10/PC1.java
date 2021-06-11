package com.sgtesting.assgn10;

class Twowheelers
{
	String bikename;
	int price;
	String fuel;
	String engine;
	String color;
	Twowheelers(String bikename,int prices,String fuel,String ENGINE,String color)
	{
		this.bikename=bikename;
		this.price=prices;
		this.fuel=fuel;
		this.engine=ENGINE;
		this.color=color;
		System.out.println("bikename is :"+this.bikename);
		System.out.println("price is "+price);
		System.out.println("fuel used is "+fuel);
		System.out.println("engine : "+engine);
		System.out.println("color is: "+color);
		System.out.println("++++++++++++++++++++++++++++");
	}
}
class Fourwheelers
{
	String carname;
	String fuel;
	String engine;
	int price;
	String color;
	Fourwheelers(String c1,int p1,String f1,String e1,String c2)
	{
		this.carname=c1;
		this.color=c2;
		this.engine=e1;
		this.fuel=f1;
		this.price=p1;
		System.out.println("carname is:"+carname);
		System.out.println("price is :"+price);
		System.out.println("fuel used is: "+fuel);
		System.out.println("engine : "+engine);
		System.out.println("color is: "+color);
	}
}
public class PC1 {

	public static void main(String[] args) {
		Twowheelers t=new Twowheelers("yamaha",200000,"petrol","125 cc","black");
		Twowheelers t1=new Twowheelers("RZ",200000,"petrol","150 cc","red");
		

		Fourwheelers f=new Fourwheelers("audi",2000000,"petrol","black","double");
		Fourwheelers f1=new Fourwheelers("bmw",2000000,"diesel","black","single");
		Fourwheelers f2=new Fourwheelers("audi",5000000,"petrol","black","double");
		


	}

}