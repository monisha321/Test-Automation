package com.sgtesting.assgn18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class BufferedReader2 {

	public static void main(String[] args) {
		readContent();

	}
	static void readContent()
	{
		BufferedReader b=null;
		String str="";
		try
		{
			b=new BufferedReader(new FileReader("E:\\\\sample\\\\weekday\\\\rose\\\\text2.txt"));
			/*LineNumberReader l=new LineNumberReader(new InputStreamReader(new FileInputStream("E:\\sample\\weekday\\rose\\text2.txt")));
			while(((str=l.readLine())!=null)&&l.getLineNumber()<5)
			{
				System.out.println();
			}
			while((l.getLineNumber()>=5)&&((str=l.readLine())!=null))
			{
				System.out.println(str);
			}*/
			
			String s[]=new String[10];
			int k=0;
			while((str=b.readLine())!=null&& (k<10))
			{
				s[k]=str;
				System.out.println(s[k]);
				k++;
			}
			for(int i=(s.length/2);i<s.length;i++)
			{
				System.out.println(s[i]);
			}
			//l.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
