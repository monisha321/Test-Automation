package com.sgtesting.assgn10;

class Football
{
	String name;
	String country;
	int matches;
	int medals;
	Football(String n,String c,int m,int me)
	{
		this.matches=m;
		this.medals=me;
		this.name=n;
		this.country=c;
		System.out.println("matches playes:"+ matches);
		System.out.println(" no of man of the matches won: "+medals);
		System.out.println("player name is :"+name);
		System.out.println("country : "+country);
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println();
	}
}
class Cricket
{
	String name;
	String country;
	int matches;
	int medals;
	Cricket(String n,String c,int m,int me)
	{
		this.matches=m;
		this.medals=me;
		this.name=n;
		this.country=c;
		System.out.println("matches playes:"+ matches);
		System.out.println(" no of man of the matches won: "+medals);
		System.out.println("player name is :"+name);
		System.out.println("country : "+country);
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println();
	}
}
class Hockey
{
	String name;
	String country;
	int matches;
	int medals;
	Hockey(String n,String c,int m,int me)
	{
		this.matches=m;
		this.medals=me;
		this.name=n;
		this.country=c;
		System.out.println("matches playes:"+ matches);
		System.out.println(" no of man of the matches won: "+medals);
		System.out.println("player name is :"+name);
		System.out.println("country : "+country);

	}
}
public class PC5 {

	public static void main(String[] args) {
		Football a=new Football("raj","india",10,7);
		Football a1=new Football("chris","australia",10,7);
		

		Cricket b=new Cricket("sachin","india",100,50);
		Cricket b1=new Cricket("christoff","newzealand",100,50);
		

		Hockey S=new Hockey("singh","india",10,9);
		Hockey S1=new Hockey("noah","usa",10,9);
		
	}

}
