package com.sgtesting.reflection5;

import java.lang.reflect.Method;

public class SampleDemo {

	public static void main(String[] args) {
		Sample obj=new  Sample();
		try
		{
			Class strParam[]=new Class[1];
			strParam[0]=String.class;
			
			Method method1=obj.getClass().getMethod("showFirstName", strParam);
			method1.invoke(obj, new String("Santosh"));
			
			Class intParam[]=new Class[1];
			intParam[0]=Integer.TYPE;
			
			Method method2=obj.getClass().getMethod("displayAge", intParam);
			method2.invoke(obj, 19);
			
			Class strParam1[]=new Class[2];
			strParam1[0]=String.class;
			strParam1[1]=String.class;
			
			Method method3=obj.getClass().getMethod("showStudentAddress", strParam1);
			method3.invoke(obj, new String("Bangalore"),new String("Karnataka"));
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
