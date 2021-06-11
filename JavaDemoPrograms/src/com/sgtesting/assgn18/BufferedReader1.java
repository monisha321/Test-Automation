package com.sgtesting.assgn18;

import java.io.BufferedReader;
//import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class BufferedReader1 
{

	public static void main(String[] args) 
	{
		readContent();

	}
	static void readContent()
	{
		BufferedReader b=null;
		String str=null;
		try
		{
			b=new BufferedReader(new FileReader("E:\\\\sample\\\\weekday\\\\rose\\\\text.txt"));
			/*LineNumberReader l=new LineNumberReader(new InputStreamReader(new FileInputStream("E:\\sample\\weekday\\rose\\text.txt")));
			
			while(((str=l.readLine())!=null)&&l.getLineNumber()<=5)
			{
				System.out.println(str);
			}*/
			String s[]=new String[5];
			int k=0;
			while((str=b.readLine())!=null&& (k<5))
			{
				s[k]=str;
				System.out.println(s[k]);
				k++;
			}
			
			
			

			System.out.println("+++++++++++++++++++");
			/*while((l.getLineNumber()>=4)&&((str=l.readLine())!=null))
			{
				System.out.println(str);
			}*/
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}
	
}
