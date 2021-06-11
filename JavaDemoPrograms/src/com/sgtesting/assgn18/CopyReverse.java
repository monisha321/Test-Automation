package com.sgtesting.assgn18;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyReverse 
{

	public static void main(String[] args)
	{

		copyContent();
	}
	static void copyContent()
	{
		BufferedReader b=null;
		BufferedWriter b1=null;
		String s=null;

		try
		{
			b=new BufferedReader(new FileReader("E:\\sql\\sql2.txt"));
			b1=new BufferedWriter(new FileWriter("E:\\sql\\sql.txt",true));
			String[] str=new String[3];
			int k=0;

			while ((s = b.readLine()) != null)
			{

				str[k]=s;
				k++;


			}
			for(int i=str.length-1;i>=0;i--)
			{
				b1.write(str[i]);
				b1.newLine();
			}
			System.out.println("file copied in reverse");
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
	}
}
