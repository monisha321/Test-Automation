package com.sgtesting.assgn8;

class State
{
	String name;
	String popln;
	String CM;
	String capital;
	String flower;
}
class Village
{
	String name;
	String state;
	String district;
	int code;
}
class Country
{
	String name;
	String gform;
	int states;
	String capital;
}
public class Multiclass3 {

	public static void main(String[] args) {
		State s=new State();
		s.capital="bangalore";
		s.CM="yediyurappa";
		s.flower="lotus";
		s.name="karnataka";
		s.popln="6 lakh";
		System.out.println("state name is: "+s.name);
		System.out.println("population is: "+s.popln);
		System.out.println("cm is : "+s.CM);
		System.out.println("capital is: "+s.capital);
		System.out.println("flower is: "+s.flower);
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println();

		Village l=new Village();
		l.code=91;
		l.district="uttara kannad";
		l.name="maski";
		l.state="karnataka";
		System.out.println("village name is :"+l.name);
		System.out.println("state is: "+l.state);
		System.out.println("district is :"+l.district);
		System.out.println("pin code :"+l.code);
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println();

		Country S=new Country();
		S.capital="delhi";
		S.gform="democracy";
		S.name="india";
		S.states=28;
		System.out.println("contry name:"+ S.name);
		System.out.println("form of govt: "+S.gform);
		System.out.println("no of states is :"+S.states);
		System.out.println("capital name: "+S.capital);

	}

}
