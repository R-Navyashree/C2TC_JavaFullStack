package com.tnsif.staticfinal_6;

public class FinalVariable {
	
	final int x=10;
	
	final static int Y;
	
	final static int z=20;
	void change() 
	{
		//x=30;
		//Y=70;
	}
	

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", y=" + Y + "]";
	}


	static {
		Y=200;
		//z=90;
	}
	
}
