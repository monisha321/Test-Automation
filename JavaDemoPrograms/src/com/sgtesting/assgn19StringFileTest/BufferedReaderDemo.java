package com.sgtesting.assgn19StringFileTest;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		readContent();
	}
	static void readContent()
	{
		BufferedReader b=null;
		try
		{
			b=new BufferedReader (new FileReader("E:\\AAA\\TEXT.txt"));
			String s=null;
			while((s=b.readLine())!=null)
			{
				System.out.println(s);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				b.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
