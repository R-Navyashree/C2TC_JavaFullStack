package com.tns.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		System.out.println("iam in main method");
		int numberOne, numberTwo, numberThree;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		while(true)
		{
			try {
				numberOne = sc.nextInt();
				numberTwo = sc.nextInt();
				numberThree = numberOne / numberTwo;
				System.out.println("Division is " + numberThree);
			}
catch (InputMismatchException e) {
				
				e.printStackTrace();
				System.out.println("Invalid input. Please enter integers only.");
				sc.nextLine();
			}
			catch (ArithmeticException e) {
				System.out.println("Exception caught: " + e.getMessage());
		}
			catch (Exception e) {
				System.out.println("Exception caught: " + e.getMessage());
				break;

	}
	}
}
}
