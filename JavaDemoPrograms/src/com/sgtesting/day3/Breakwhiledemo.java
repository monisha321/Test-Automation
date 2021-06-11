package com.sgtesting.day3;

public class Breakwhiledemo {

	public static void main(String[] args) {
		int i=10;
		while(true)// 'false' doesnt work here 
		
		{
			System.out.println(i);
			if(i==17)
			{
				break;
			}
			i=i+1;

		}

	}

}
