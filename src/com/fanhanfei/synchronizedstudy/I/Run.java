package com.fanhanfei.synchronizedstudy.I;

public class Run {

	public static void main(String[] args) {
		Task task = new Task();
		MyThread1 myThread1 = new MyThread1(task);
		myThread1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MyThread2 myThread2 = new MyThread2(task);
		myThread2.start();
	}

}
