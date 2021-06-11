package com.sgtesting.log4j;

public class AutoITTestscript1 {

	public static void main(String[] args) {
		executeautoIt();
	}
static void executeautoIt()
{
	try
	{
		Runtime.getRuntime().exec("E:\\AUTOIT\\testscript6.exe");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
