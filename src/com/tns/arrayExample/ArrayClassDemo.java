package com.tns.arrayExample;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		int intArr[]= {10, 20, 15, 22, 35, 18 , 14 };// declare and initiaze
		
		for(int i=0;i<intArr.length;i++)
			System.out.println(intArr[i]);
		
		System.out.println("The array is"+Arrays.toString(intArr));// by using predefined Arrays class
		Arrays.sort(intArr);// ascending
		System.out.println("Sorted array"+Arrays.toString(intArr));
		
		

	}

}

