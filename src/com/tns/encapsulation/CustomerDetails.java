package com.tnsif.Day3;


import java.util.Scanner;

public class CustomerDetails {
  private String cusName;
  private int cusId;
  private long cusPho;
  public CustomerDetails() {
    System.out.println("Default constructor");
  }
  public CustomerDetails(String cusName, int cusId, long cusPho) {
    System.out.println("Parameterized constructor");
    this.cusName = cusName;
    this.cusId = cusId;
    this.cusPho = cusPho;
  }
  public String getCusName() {
    return cusName;
  }
  public void setCusName(String cusName) {
    this.cusName = cusName;
  }
  public int getCusId() {
    return cusId;
  }
  public void setCusId(int cusId) {
    this.cusId = cusId;
  }
  public long getCusPho() {
    return cusPho;
  }
  public void setCusPho(long cusPho) {
    this.cusPho = cusPho;
  }
  @Override
  public String toString() {
    return "CustomerDetails [cusName=" + cusName + ", cusId=" + cusId + ", cusPho=" + cusPho + "]";
  }
  
  
  
  
    
  }
