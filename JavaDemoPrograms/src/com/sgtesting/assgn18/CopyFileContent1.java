package com.sgtesting.assgn18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class CopyFileContent1 {

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
			b=new BufferedReader(new FileReader("E:\\sample\\weekday\\rose\\text.txt"));
			b1=new BufferedWriter(new FileWriter("E:\\sample\\weekday\\rose\\text2.txt",true));
			/*LineNumberReader l=new LineNumberReader(new InputStreamReader(new FileInputStream("E:\\sample\\weekday\\rose\\text.txt")));


			while ((s = l.readLine()) != null&&(l.getLineNumber()<5))
			{

				System.out.println();

			}

			while ((l.getLineNumber()>=5)&&((s = l.readLine()) != null))
			{

				b1.write(s+'\n');

			}*/
			
			String str[]=new String[10];
			int k=0;
			while((s=b.readLine())!=null&& (k<10))
			{
				str[k]=s;
				
				k++;
			}
			for(int i=(str.length/2);i<str.length;i++)
			{
				b1.write(str[i]+'\n');
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


