package com.sgtesting.assgn19StringFileTest;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialisationDemo {

	public static void main(String[] args) {
		SerialisationTesting();
	}
	static void SerialisationTesting()
	{
		FileOutputStream f=null;
		ObjectOutputStream o=null;
		Flower obj=new Flower();
		try
		{
			f=new FileOutputStream("E:\\AAA\\Employee.ser");
			o=new ObjectOutputStream(f);
			o.writeObject(obj);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				f.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
