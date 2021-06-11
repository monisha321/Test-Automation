package com.sgtesting.assgn8;
class Student
{
	String name;
	int rollno;
	int age;
	String city;
	int classrank;
}
class Library
{
	String book;
	String author;
	String student;
	String subject;
}
class Sport
{
	String student;
	String sname;
	int matches;
	String medal;
}
public class Multiclass2 {

	public static void main(String[] args) {
		Student s=new Student();
		s.age=17;
		s.city="bangalore";
		s.classrank=4;
		s.name="sanket";
		s.rollno=56;
		System.out.println("student name is: "+s.name);
		System.out.println("age is: "+s.age);
		System.out.println("classrank : "+s.classrank);
		System.out.println("roll no is: "+s.rollno);
		System.out.println("city is: "+s.city);
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println();

		Library l=new Library();
		l.author="yuval";
		l.book="sapiens";
		l.student="prashant";
		l.subject="anthro";
		System.out.println("author name is :"+l.author);
		System.out.println("book name is: "+l.book);
		System.out.println("student name is :"+l.student);
		System.out.println("subject of the book :"+l.subject);
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println();

		Sport S=new Sport();
		S.matches=10;
		S.medal="gold";
		S.student="prashant";
		S.sname="archery";
		System.out.println("matches playes:"+ S.matches);
		System.out.println("medal won: "+S.medal);
		System.out.println("student name is :"+S.student);
		System.out.println("sport name: "+S.sname);



	}

}
