package com.sgtesting.assgn17;

public class StringWordUpper {

	public static void main(String[] args) {
		upperStr();
	}
	static void upperStr()
	{
	String s1="she is a queen";
	String s[]=s1.split(" ");  
    String c="";  
    
    for(String w:s)
    {  
        String first=w.substring(0,1);  
        String afterfirst=w.substring(1);  
        c+=first.toUpperCase()+afterfirst+" ";  
    } 
    System.out.println(c);
    
}
}
