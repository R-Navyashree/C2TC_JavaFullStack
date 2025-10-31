package com.tns.threadex;

public class UsingRunnable implements Runnable
{
	int high, low;
	String msg;
	Thread thread;
	
	public UsingRunnable(int high, int low, String msg) {
		
		this.high = high;
		this.low = low;
		this.msg = msg;
		thread=new Thread(this, "childthread");
		thread.start();
	}
@Override
	public void run() {
		for (int i = low; i <= high; i++)
		{
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				System.out.println("Error " + e.getMessage());
			}
			System.out.println(msg + i);
		}
	
	}
}