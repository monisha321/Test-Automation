package com.sgtesting.assgn18;

import java.io.File;

public class CreateSubfolders {

	public static void main(String[] args) {
		
		create();
	}

	
	static void create()
	{
		String path = "E:\\sample";
		
		String s[]=new String[10];

		for(int i=0;i<s.length;i++) 
		{

			String newName = "my_file_" + i ;
			String newPath = path + "\\" + newName;
			File f2=new File(newPath);
			boolean val=f2.mkdir();
			System.out.println(val);
		}
	}


}

