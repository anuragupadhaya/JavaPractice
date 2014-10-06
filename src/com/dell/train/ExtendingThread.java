package com.dell.train;

class MyApp extends Thread {

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			System.out.println("In the run method of Thread class");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("returning to main class");
	}

}

public class ExtendingThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyApp t = new MyApp();
		t.start();
		System.out.println("Thread of main class");
	}

}
