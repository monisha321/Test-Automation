package com.sgtesting.assgn4;

public class ArraybyteDowhile {

	public static void main(String[] args) {
		byte a[]= {111,112,113};
		int i=0;//why cant 'i' be designated to byte or short?= bcoz a[i] values are integers and starts from 0//
		do
		{
			System.out.println(a[i]);
			i=i+1;
		}while(i<a.length);

	}

}
