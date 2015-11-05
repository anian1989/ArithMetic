package com.fanhanfei.synchronizedstudy.I;

public class MyThread1 extends Thread {

	private Task task;
	public MyThread1(Task task){
		super();
		this.task = task;
	}
	
	
	public void run(){
		super.run();
		task.doLongTimeTask();
	}
}
