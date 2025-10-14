package com.tnsif.staticfinal_6;

public class MyClass {
	private int section;//non - static 
	private static int srNo;// static 
	
	
	// static block
	static {
		System.out.println("----Within static block-----");
		srNo=1000;
		
	}
	
	MyClass() {
		System.out.println("----Within Default block-----");
		srNo++;
		section++;
		
	}

	@Override
	public String toString() {
		return "MyClass [SerialNo"+srNo+",section=" + section + "]";
	}
	
	static void display() {
		System.out.println("Serial No"+srNo);
	}

	
}
