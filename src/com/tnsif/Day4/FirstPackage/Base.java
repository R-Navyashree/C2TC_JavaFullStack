// Progarm to Demonstrate package and access modifiers
package com.tnsif.Day4.FirstPackage;

public class Base {
	int defaultVar= 10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	// Declare Methods
	void methodDefault() {
		System.out.println("Default access Basee Class");
		System.out.println("Default Variable:"+ defaultVar);
	}
	
	public void methodPublic() {
		System.out.println("Public access Basee Class");
		System.out.println("Public Variable:"+ varPublic);
	}
	
	private void methodPrivate() {
		System.out.println("Private access Basee Class");
		System.out.println("Private Variable:"+ varPrivate);
	}
	protected void methodProtected() {
		System.out.println("Protected access Basee Class");
		System.out.println("Protected Variable:"+ varProtected);
	}
	
	
	
	
	
	
}
