package com.tnsif.Day3;

import java.util.Scanner;

public class Customer {
  public static void main (String args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name");
    String name=sc.next();
    System.out.println("Enter your phone number");
    long ph=sc.nextLong();
    System.out.println("Enter your salary");
    int id=sc.nextInt();
    System.out.println("Enter your Address");
    String add=sc.next();
    
    CustomerDetails c=new CustomerDetails();
    c.setCusId(id);
    c.setCusName(name);
    c.setCusPho(ph);
    
    System.out.println(c);
    
    
  }
}
