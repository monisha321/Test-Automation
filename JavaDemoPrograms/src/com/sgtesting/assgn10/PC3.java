package com.sgtesting.assgn10;

class State
{
	String name;
	String popln;
	String CM;
	String capital;
	String flower;
	State(String n,String p,String c,String c1,String f)
	{
		this.capital=c1;
		this.CM=c;
		this.flower=f;
		this.name=n;
		this.popln=p;
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
	
	Village(String n,String s,String d,int c)
	{
		this.code=c;
		this.district=d;
		this.name=n;
		this.state=s;
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
	Country(String n,String g,int s,String c)
	{
		this.capital=c;
		this.gform=g;
		this.name=n;
		this.states=s;
		System.out.println("contry name:"+ name);
		System.out.println("form of govt: "+gform);
		System.out.println("no of states is :"+states);
		System.out.println("capital name: "+capital);
	}
}
public class PC3 {

	public static void main(String[] args) {
		State s=new State("karnataka","6 crore","yediyurappa","bangalore","lotus");
		State s1=new State("kerala","6 crore","vijayan","trivandrum","lotus");
		
		

		Village l=new Village("honnur","karnataka","north kar",91);
		Village l1=new Village("araku","andhra","vizag",91);
		
		Country S=new Country("india","democracy",28,"delhi");
		Country S1=new Country("USA","democracy",50,"washington dc");
		

	}


}
