package com.sgtesting.AssertionsConditions;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertionConditionTesting {
	
	@Test
	public void assertTrueTesting()
	{
		int a=25;
		int b=100;
		Assert.assertTrue(a<=b);
		System.out.println("This is the last statement in assertTrue Example!!!");
	}
	
	@Test
	public void assertFalseTesting()
	{
		int a=25;
		int b=100;
		Assert.assertFalse(a<=b);
		System.out.println("This is the last statement in assertFalse Example!!!");
	}

	@Test
	public void assertEqulasTesting()
	{
		String s1=new String("JavaScript");
		String s2="JavaScript1";
		Assert.assertEquals(s1, s2);
		System.out.println("This is the last statement in assertEqulas Example!!!");
	}
	
	@Test
	public void assertNotEqulasTesting()
	{
		String s1=new String("JavaScript");
		String s2="JavaScript1";
		Assert.assertNotEquals(s1, s2);
		System.out.println("This is the last statement in assertNotEqulas Example!!!");
	}
	
	@Test
	public void assertNullTesting()
	{
		File f1=null;
		Assert.assertNull(f1);
		System.out.println("This is the last statement in assertNull Example!!!");
	}

	@Test
	public void assertNotNullTesting()
	{
		File f1=null;
		f1=new File("F:\\HTML");
		Assert.assertNotNull(f1);
		System.out.println("This is the last statement in assertNotNull Example!!!");
	}
	
	@Test
	public void assertSameTesting()
	{
		String s1="JavaScript";
		String s2="JavaScript";
		Assert.assertSame(s1, s2);
		System.out.println("This is the last statement in assertSame Example!!!");
	}

	
	@Test
	public void assertNotSameTesting()
	{
		String s1="JavaScript";
		String s2=new String("JavaScript1");
		Assert.assertNotSame(s1, s2);
		System.out.println("This is the last statement in assertNotSame Example!!!");
	}
}
