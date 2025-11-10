package com.tnsif.Day3;

public class Person {
  //Data members
  private String name;
  private String address;
  private long aadhar;
  //Getter and setter
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public long getAadhar() {
    return aadhar;
  }
  public void setAadhar(long aadhar) {
    this.aadhar = aadhar;
  }
  @Override
  public String toString() {
    return "Person [name=" + name + ", address=" + address + ", aadhar=" + aadhar + "]";
  }}