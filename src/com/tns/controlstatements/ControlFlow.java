package com.tnsif.Day2;

public class ControlFlow {
	
	    public static void main(String[] args) {
	        // 1. If Statement
	        int number = 10;
	        if (number > 0) {
	            System.out.println("Positive number");
	        }

	        // 2. Decision-Making Operators
	        int a = 5, b = 10;
	        String result = (a > b) ? "a is greater" : "b is greater";
	        System.out.println("Decision: " + result);

	        // 3. For Loop
	        System.out.println("For Loop:");
	        for (int i = 0; i < 5; i++) {
	            System.out.println("i = " + i);
	        }

	        // 4. For-Each Loop
	        System.out.println("For-Each Loop:");
	        int[] nums = {1, 2, 3, 4, 5};
	        for (int n : nums) {
	            System.out.println("n = " + n);
	        }

	        // 5. While Loop
	        System.out.println("While Loop:");
	        int count = 0;
	        while (count < 3) {
	            System.out.println("count = " + count);
	            count++;
	        }

	        // 6. Do-While Loop
	        System.out.println("Do-While Loop:");
	        int x = 0;
	        do {
	            System.out.println("x = " + x);
	            x++;
	        } while (x < 3);

	        // 7. Break Statement
	        System.out.println("Break Demo:");
	        for (int i = 0; i < 10; i++) {
	            if (i == 5) {
	                System.out.println("Breaking at i = " + i);
	                break;
	            }
	            System.out.println("i = " + i);
	        }

	        // 8. Continue Statement
	        System.out.println("Continue Demo:");
	        for (int i = 0; i < 5; i++) {
	            if (i == 2) {
	                System.out.println("Skipping i = " + i);
	                continue;
	            }
	            System.out.println("i = " + i);
	        }
	    }
	
	

}
