package com.sgtesting.assgn19StringFileTest;

import java.io.File;

public class FolderOperations {

	public static void main(String[] args) {
		folderCreate();
		folderNested();
		renameFolder();
		deleteFolder();
	}
	static void folderCreate()
	{
		File f=new File("E:\\AAA\\AA");
		boolean val=f.mkdir();
		System.out.println("folder created "+val);
	}
	static void folderNested()
	{
		File f=new File("E:\\AAA\\BB\\CC\\DD\\EE\\FF");
		boolean val=f.mkdirs();
		System.out.println("nested folder created "+val);
	}
	static void renameFolder()
	{
		File f=new File("E:\\AAA\\AA");
		File f1=new File("E:\\AAA\\new");
		boolean val=f.renameTo(f1);
		System.out.println("folder is renamed "+val);
	}
	static void deleteFolder()
	{
		File f1=new File("E:\\AAA\\new");
		boolean val=f1.delete();
		System.out.println("the folder is deleted "+val);
	}

}
