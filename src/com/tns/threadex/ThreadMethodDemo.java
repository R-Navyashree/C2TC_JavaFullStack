package com.tns.threadex;

public class ThreadMethodDemo {

	public static void main(String[] args) {
		ChildThread threadOne = new ChildThread(5,"First");
		ChildThread threadTwo = new ChildThread(10,"Second");
		threadOne.start();
		threadTwo.start();
		Thread.currentThread().setName("parent");
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println("Current Thread: " + Thread.currentThread());
		try {
			threadOne.join(); // wait current thread until t1 is dead
			threadTwo.join(300); // wait current thread until t2 is dead or time period is over
		} catch (InterruptedException e) {
			System.err.println("Thread interrupted: " + e.getMessage());
		}
		System.out.println("-----------------------End of Main--------------------------");

	}

}