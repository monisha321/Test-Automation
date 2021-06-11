package com.sgtesting.day5;

public class Explicitcastingdemo {

	public static void main(String[] args) {
		
		int a=Integer.parseInt(args[0]);
		
		/*if int is more than 256,the byte will store the remiander by applying
		   mod operation as byte size is 256 only*/
		
		System.out.println(a+"int a");
		
		
		byte b=(byte) a; //important to use '(byte)' to cast on the RHS.
		System.out.println(b+" byte b");

	}

}
