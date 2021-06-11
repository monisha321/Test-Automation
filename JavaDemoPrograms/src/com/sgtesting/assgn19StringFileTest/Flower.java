package com.sgtesting.assgn19StringFileTest;
import java.io.Serializable;
public class Flower implements serializable{
	public void showColour(String color)
	{
		System.out.println("color of the flower is "+color);
	}
	public void showName(String name)
	{
		System.out.println("name of the flower is "+name);
	}
	public void showSeason(String season)
	{
		System.out.println("flower blooms in the season "+season);
	}

	

}
