package com.tns.ExceptionHandling;

public class TryCatchDemo {

	public static void main(String[] args) {
		System.out.println("I am in main method");
		int result;
		TryCatchExample.performDivision(12, 0);
		System.out.println(TryCatchExample.performDivision(12.6f, 13.4f));
		

	}

}