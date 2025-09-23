package com.tnsif.Day3;


import java.util.Scanner;

public class PersonDemo {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String address;
    long aadhar;
    
    System.out.println("Enter the person Name:");
    String name=sc.nextLine();
    
    System.out.println("Enter the person Address:");
    address=sc.nextLine();
    System.out.println("Enter the person AadharNo:");
    aadhar=sc.nextLong();
    Person p= new Person();
    p.setName(name);
    p.setAadhar(aadhar);
    p.setAddress(address);
    
    
    System.out.println(p);
    
  }

}