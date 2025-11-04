package com.tns.LambdaExpEx;


public class Main {

	public static void main(String[] args) {
		
		//lambda expression
		
		IStatement s=()->{
			return "Hi";
		};
		System.out.println(s.show());
		
	}

}
