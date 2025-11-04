package com.tns.LambdaExpEx;

public class LambdaWithParaEx {

	public static void main(String[] args) {
		Message m=(name)->
		{
			System.out.println("Hello world"+name);
		};
		m.greet("Navya");
		
		Cube c=(a)->
		{
			return (a*a*a);
			
		};
		System.out.println(c.calculate(2));

	}
	

}
