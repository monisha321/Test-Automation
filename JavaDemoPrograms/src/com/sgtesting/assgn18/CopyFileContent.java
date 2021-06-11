package com.sgtesting.assgn18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class CopyFileContent {

	public static void main(String[] args) {

		copyContent();
	}
	static void copyContent()
	{

		BufferedReader b=null;
		BufferedWriter b1=null;
		String str="";

		try
		{
			b=new BufferedReader(new FileReader("E:\\sample\\weekday\\rose\\text.txt"));
			b1=new BufferedWriter(new FileWriter("E:\\sample\\weekday\\rose\\text2.txt",true));
			//LineNumberReader l=new LineNumberReader(new InputStreamReader(new FileInputStream("E:\\sample\\weekday\\rose\\text.txt")));
			

			//while ((s = l.readLine()) != null&&(l.getLineNumber()<=5))
			//{

				//b1.write(s+'\n');
				
				
			//}
			
			String s[]=new String[10];
			int k=0;
			while((str=b.readLine())!=null&& (k<10))
			{
				s[k]=str;
				b1.write(s[k]+'\n');
				System.out.println(s[k]);
				k++;
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
