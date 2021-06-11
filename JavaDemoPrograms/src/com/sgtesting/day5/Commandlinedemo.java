package com.sgtesting.day5;

public class Commandlinedemo {  //run the pgm as run configuration and provide input//

	public static void main(String[] args) {
		//int age=args[0];    --- error bcoz args a  string cant take integer//

		int age=Integer.parseInt(args[0]);

		if (age>=18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			System.out.println("not eligible");
		}

	}

}
