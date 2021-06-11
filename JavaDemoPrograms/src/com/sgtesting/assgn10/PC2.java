package com.sgtesting.assgn10;

class Student
{
	String name;
	int rollno;
	int age;
	String city;
	int classrank;
	Student(String n,int r,int a,String c,int c1)
	{
		this.age=a;
		this.city=c;
		this.classrank=c1;
		this.name=n;
		this.rollno=r;
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
	Library(String b,String a,String s,String s1)
	{
		this.author=a;
		this.book=b;
		this.student=s;
		this.subject=s1;
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
	Sport(String s,String n,int m,String me)
	{
		this.matches=m;
		this.medal=me;
		this.student=s;
		this.sname=n;
		System.out.println("matches playes:"+ matches);
		System.out.println("medal won: "+medal);
		System.out.println("student name is :"+student);
		System.out.println("sport name: "+sname);
	}
}
public class PC2 {

	public static void main(String[] args) {
		Student s=new Student("minni",56,21,"bangalore",10);
		Student s1=new Student("madhu",56,21,"mysore",3);
		Student s2=new Student("shreya",56,21,"chennai",1);
		

		Library l=new Library("yuval","sapiens","madhu","anthro");
		Library l1=new Library("john","stars","shreya","novel");
		
		
		Sport S=new Sport("raju","football",10,"gold");
		Sport S1=new Sport("raj","running",10,"gold");
		



	}

}