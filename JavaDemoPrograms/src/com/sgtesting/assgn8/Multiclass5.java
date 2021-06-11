package com.sgtesting.assgn8;

class Footballplayer
{
	String name;
	String country;
	int matches;
	int medals;
}
class Cricketplayer
{
	String name;
	String country;
	int matches;
	int medals;
}
class Hockeyplayer
{
	String name;
	String country;
	int matches;
	int medals;
}
public class Multiclass5 {

	public static void main(String[] args) {
		Footballplayer a=new Footballplayer();
		a.matches=10;
		a.medals=20;
		a.name="chris";
		a.country="australia";
		System.out.println("matches playes:"+ a.matches);
		System.out.println(" no of man of the matches won: "+a.medals);
		System.out.println("player name is :"+a.name);
		System.out.println("country : "+a.country);
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println();

		Cricketplayer b=new Cricketplayer();
		b.matches=18;
		b.medals=7;
		b.name="christoff";
		b.country="newzealand";
		System.out.println("matches playes:"+ b.matches);
		System.out.println(" no of man of the matches won: "+b.medals);
		System.out.println("player name is :"+b.name);
		System.out.println("country : "+b.country);
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println();

		Hockeyplayer S=new Hockeyplayer();
		S.matches=10;
		S.medals=12;
		S.name="prashant";
		S.country="india";
		System.out.println("matches playes:"+ S.matches);
		System.out.println(" no of man of the matches won: "+S.medals);
		System.out.println("player name is :"+S.name);
		System.out.println("country : "+S.country);

	}

}
