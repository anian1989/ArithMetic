package com.fanhanfei.synchronizedstudy.E;

public class ThreadB extends Thread{
	private MyObject object;
	public ThreadB(MyObject object){
		super();
		this.object = object;
	}

	public void run(){
		super.run();
		object.methodA();
	}
}
