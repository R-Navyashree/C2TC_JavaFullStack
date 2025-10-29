package com.tns.threadex;

public class ThreadDemo {

	public static void main(String[] args) {
		ChildThread obj = new ChildThread(5,"Hello");//First instance
		ChildThread obj1 = new ChildThread(4,"World");//second instance
		obj.start();
		obj1.start();
		//obj.run();
		System.out.println("-----------------------End of Main--------------------------");
		
	}

}