package com.sgtesting.assgn9;

class State
{
	String name;
	String popln;
	String CM;
	String capital;
	String flower;
	State()
	{
		capital="bangalore";
		CM="yediyurappa";
		flower="lotus";
		name="karnataka";
		popln="6 lakh";
		System.out.println("state name is: "+name);
		System.out.println("population is: "+popln);
		System.out.println("cm is : "+CM);
		System.out.println("capital is: "+capital);
		System.out.println("flower is: "+flower);
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println();
	}
}
class Village
{
	String name;
	String state;
	String district;
	int code;
	Village()
	{
		code=91;
		district="uttara kannad";
		name="maski";
		state="karnataka";
		System.out.println("village name is :"+name);
		System.out.println("state is: "+state);
		System.out.println("district is :"+district);
		System.out.println("pin code :"+code);
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println();

	}
}
class Country
{
	String name;
	String gform;
	int states;
	String capital;
	Country()
	{
		capital="delhi";
		gform="democracy";
		name="india";
		states=28;
		System.out.println("contry name:"+ name);
		System.out.println("form of govt: "+gform);
		System.out.println("no of states is :"+states);
		System.out.println("capital name: "+capital);
	}
}
public class Multiclass2Noargs {

	public static void main(String[] args) {
		State s=new State();
		

		Village l=new Village();
		
		Country S=new Country();
		

	}

}