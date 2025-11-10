package com.tns.staticfinal;

public class Employee 
{
	private String name;
	private int id;
	
	static String CompanyName="Dsatm";

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + name + ", Id=" + id +  ", CompanyName="+CompanyName+"]";
	} 
	
	
}
