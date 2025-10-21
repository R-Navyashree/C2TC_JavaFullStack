package com.tns.interfaceex;

public class MarkerDemo {

	public static void main(String[] args) {
		Student s = new Student(101,"hita",1234f, "CSE");
		if(s instanceof Registerable )//true
		
			System.out.println("it is a reference for interface");
			else
				System.out.println("it is not a reference");
		

	}

}

