package com.tns.ExceptionHandling;

public class TryCatchExample {
	static int performDivision(int x, int y)
	{
		System.out.println("iam from division");
		int z=0;
		try {
			z=x/y;//exception
			System.out.println("iam from division2");
		} 
		catch (ArithmeticException e) {
			
			System.out.println("exception is caught");
		}
		
		return z;
				
	}
	
	static float performDivision(float a, float b) {
		return a / b;

}

}

