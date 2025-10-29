package com.tns.ExceptionHandling;

import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter the number : ");
			int number = scanner.nextInt();
			System.out.println(number % 2 == 0 ? number + " is Even" : number + " is Odd");
		}
//		catch (Exception e) {
//		
//		System.out.println("inavalid input ");
//	}
		finally
{
			System.out.println("In Finally....");
			scanner.close();
		}

		System.out.println("out of catch");

	}

}
