package com.sgtesting.assgn9;

class Twowheelers
	{
		String bikename;
		int price;
		String fuel;
		String engine;
		String color;
		Twowheelers()
		{
			bikename="yamaha";
			price=25000;
			fuel="petrol";
			engine="125cc";
			color="black";
			System.out.println("bikename is :"+bikename);
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
		Fourwheelers()
		{
			carname="audi";
			color="black";
			engine="double engine";
			fuel="diesel";
			price=4000000;
			System.out.println("carname is:"+carname);
			System.out.println("price is :"+price);
			System.out.println("fuel used is: "+fuel);
			System.out.println("engine : "+engine);
			System.out.println("color is: "+color);
		}
	}
	public class MulticlassNoargs {

		public static void main(String[] args) {
			Twowheelers t=new Twowheelers();

			Fourwheelers f=new Fourwheelers();
			


		}

	}

