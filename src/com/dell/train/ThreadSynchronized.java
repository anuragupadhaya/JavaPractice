package com.dell.train;

public class ThreadSynchronized implements Runnable {
	private int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSynchronized th = new ThreadSynchronized();
		Thread t1 = new Thread(th);
		Thread t2 = new Thread(th);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(th.count);
	}
	
	public synchronized void add() {
		for (int i = 1; i <= 10000; i++)
			count++;
	}
		

	@Override
	public void run() {
		// TODO Auto-generated method stub
		add();
		}

}
