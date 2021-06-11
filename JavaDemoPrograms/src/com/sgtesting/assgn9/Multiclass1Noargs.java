package com.sgtesting.assgn9;

class Student
{
	String name;
	int rollno;
	int age;
	String city;
	int classrank;
	Student()//no args constructor---constructor name =class name
	{
		age=17;
		city="bangalore";
		classrank=4;
		name="sanket";
		rollno=56;
		System.out.println("student name is: "+name);
		System.out.println("age is: "+age);
		System.out.println("classrank : "+classrank);
		System.out.println("roll no is: "+rollno);
		System.out.println("city is: "+city);
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println();
	}
}
class Library
{
	String book;
	String author;
	String student;
	String subject;
	Library()
	{
		author="yuval";
		book="sapiens";
		student="prashant";
		subject="anthro";
		System.out.println("author name is :"+author);
		System.out.println("book name is: "+book);
		System.out.println("student name is :"+student);
		System.out.println("subject of the book :"+subject);
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println();

	}
}
class Sport
{
	String student;
	String sname;
	int matches;
	String medal;
	Sport()
	{
		matches=10;
		medal="gold";
		student="prashant";
		sname="archery";
		System.out.println("matches playes:"+ matches);
		System.out.println("medal won: "+medal);
		System.out.println("student name is :"+student);
		System.out.println("sport name: "+sname);
	}
}
public class Multiclass1Noargs {

	public static void main(String[] args) {
		Student s=new Student();
		

		Library l=new Library();
		
		Sport S=new Sport();
		



	}

}