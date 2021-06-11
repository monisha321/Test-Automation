package com.sgtesting.assgn18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class Countlines {

	public static void main(String[] args) {
		readContent();

	}
	static void readContent()
	{
		BufferedReader b=null;
		String str="";
		int count=0,count2=0;
		int count1=0;
		int n=0;
		

		try
		{
			FileReader f=new FileReader("E:\\\\sample\\\\weekday\\\\rose\\\\text2.txt");
			/*while(true)
			{
				n=f.read();
				if(n==-1)
				{
					break;
				}
				count1++;
			}
			System.out.println(count1);//--->if this loop works then next while loop doesnt work,dont know why*/

			b=new BufferedReader(f);


			//LineNumberReader l=new LineNumberReader(new InputStreamReader(new FileInputStream("E:\\sample\\weekday\\rose\\text2.txt")));
			while(((str=b.readLine())!=null))
			{
				count++;
				char ch[]=str.toCharArray();
				for(int i=0;i<ch.length;i++)
				{
					if(ch[i]!=' ')
					{
						count1++;
					}
				}
				String[] s=str.split("\\s+");
				count2+=s.length;

				
				/*
				while(true)
				{
					n=f.read();
					if(n==-1)
					{
						break;
					}
					count1++;
				}//---->not working,even when while loop is used here ---dont know why*/





			}

			System.out.println("number of lines "+count);
			System.out.println("numer of letters "+count1);
			System.out.println("number of words "+count2);



		}catch(Exception e)
		{
			e.printStackTrace();
		}


	}

}


