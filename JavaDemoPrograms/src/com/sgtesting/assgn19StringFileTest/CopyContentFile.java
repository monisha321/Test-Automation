package com.sgtesting.assgn19StringFileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class CopyContentFile {

	public static void main(String[] args) {
		copyContent();

	}
	static void copyContent()
	{

		BufferedReader b=null;
		BufferedWriter b1=null;
		String s="";

		try
		{
			b=new BufferedReader(new FileReader("E:\\AAA\\File1.txt"));
			b1=new BufferedWriter(new FileWriter("E:\\AAA\\File2.txt"));
			LineNumberReader l=new LineNumberReader(new InputStreamReader(new FileInputStream("E:\\\\AAA\\\\File1.txt")));


			while ((s = l.readLine()) != null&&(l.getLineNumber()<=5))
			{
				b1.write(s+'\n');

			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try
			{
				if (b != null) {

					b.close();
				}

				if (b1 != null) {
					b1.close();
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("File Copied");

	}
}
