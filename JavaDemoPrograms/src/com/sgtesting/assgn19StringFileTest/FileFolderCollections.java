package com.sgtesting.assgn19StringFileTest;

import java.io.File;

public class FileFolderCollections {

	public static void main(String[] args) {
		fileCollection();
	}
	static void fileCollection()
	{
		File f=new File("E:\\sample");
		String s[]=f.list();
		try
		{
			for(int i=0;i<=s.length;i++)
			{
				File f1=new File(f,s[i]);
				if(f1.isDirectory()==true)
				{
					System.out.println("the directory is "+f1.getAbsolutePath());
				}
				else if(f1.isFile()==true)
				{
					System.out.println("the file is "+f1.getAbsolutePath());
				}
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}


	}
}
