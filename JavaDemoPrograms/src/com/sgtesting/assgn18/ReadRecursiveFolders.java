package com.sgtesting.assgn18;

import java.io.File;

public class ReadRecursiveFolders {

	public static void main(String[] args) {
		folderCollection();

	}
	static void folderCollection()
	{
		File f=new File("E:\\sample");
		try
		{
			
			String s[]=f.list();
			for(int i=0;i<s.length;i++)
			{
				System.out.println(s[i]);
				File f1=new File(f,s[i]);
				if(f1.isDirectory()==true) 
				{
					String fo=f1.getAbsolutePath();
					System.out.println(fo);	
				}

			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}