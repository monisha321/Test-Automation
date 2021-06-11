package com.sgtesting.assgn18;

import java.io.File;

public class DeleteFoldersEndingwithDay {

	public static void main(String[] args) {//after executing check the folder-u will see folders were deleted
		deleteFolder();
	}
	static void deleteFolder()
	{

		File f=new File("E:\\sample3");
		
		System.out.println(f);
		
		for (File s : f.listFiles())
		{
			System.out.println(s.getName());
			System.out.println(s);
			String name=s.getName();
			if (!name.endsWith("day"))
			{
				boolean val=s.delete();
				System.out.println(val);
				System.out.println();
				
			}
			
			//System.out.println(s);
			//System.out.println(s.getName());
			//System.out.println(s.getName().charAt(2));
			//System.out.println(s.getName().compareTo("ly"));
			//System.out.println(s.getName().compareToIgnoreCase("ly"));
			//System.out.println(s.getName().contentEquals("lilly"));
			//System.out.println(s.getName().contentEquals("lilly"));
			//System.out.println(s.getName().equals(f));
		}
		
	}
}