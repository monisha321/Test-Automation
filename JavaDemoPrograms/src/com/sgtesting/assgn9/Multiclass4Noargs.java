package com.sgtesting.assgn9;

class Footballplayer
{
	String name;
	String country;
	int matches;
	int medals;
	Footballplayer()
	{
		matches=10;
		medals=20;
		name="chris";
		country="australia";
		System.out.println("matches playes:"+ matches);
		System.out.println(" no of man of the matches won: "+medals);
		System.out.println("player name is :"+name);
		System.out.println("country : "+country);
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println();
	}
}
class Cricketplayer
{
	String name;
	String country;
	int matches;
	int medals;
	Cricketplayer()
	{
		matches=18;
		medals=7;
		name="christoff";
		country="newzealand";
		System.out.println("matches playes:"+ matches);
		System.out.println(" no of man of the matches won: "+medals);
		System.out.println("player name is :"+name);
		System.out.println("country : "+country);
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println();
	}
}
class Hockeyplayer
{
	String name;
	String country;
	int matches;
	int medals;
	Hockeyplayer()
	{
		matches=10;
		medals=12;
		name="prashant";
		country="india";
		System.out.println("matches playes:"+ matches);
		System.out.println(" no of man of the matches won: "+medals);
		System.out.println("player name is :"+name);
		System.out.println("country : "+country);

	}
}
public class Multiclass4Noargs {

	public static void main(String[] args) {
		Footballplayer a=new Footballplayer();
		

		Cricketplayer b=new Cricketplayer();
		

		Hockeyplayer S=new Hockeyplayer();
		
	}

}
