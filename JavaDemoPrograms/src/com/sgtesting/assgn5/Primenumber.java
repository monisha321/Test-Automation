package com.sgtesting.assgn5;

public class Primenumber {

	public static void main(String[] args) {
		int a=11;
		boolean x=false;//or int flag=0;
		for(int n=2;n<a;n++) 
		{
			
			if(a%n==0)
			{
				x=true;//flag+=1;
				break;//IMPORTANT
			}
		}
		if (!x)//if(flag==0)
		{
			System.out.println(a+"is a prime");
		}
		else
		{
			System.out.println(a+"is not a prime");
		}
		
		

	}

}
