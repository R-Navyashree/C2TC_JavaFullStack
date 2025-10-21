package com.tns.interfaceex;

public class FunctionalDemo {

	public static void main(String[] args) {
		GreetClass g1=new GreetClass();
		System.out.println(g1.greet());
		
		// lambda expression
		GreetInterface g2 = () -> {
		    return "I am from greet class";
		};
		System.out.println(g2.greet());
	}

}
