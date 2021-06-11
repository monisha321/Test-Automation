package com.sgtesting.day4;
import java.util.Scanner;
import java.util.Arrays;//important for arrays//
public class Array1DScanner {

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		System.out.println("enter length of array");
		int x=a.nextInt();//x=length of array//
		int [] arr=new int[x];
		System.out.println("enter array elements");
		for(int i=0;i<x;i++)
		{
			arr[i]=a.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		a.close();
	}

}
