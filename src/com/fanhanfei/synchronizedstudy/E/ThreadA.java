package com.fanhanfei.synchronizedstudy.E;

public class ThreadA extends Thread{
	private MyObject object;
	public ThreadA(MyObject object){
		super();
		this.object = object;
	}
	public void run(){
		super.run();
		object.methodA();
	}
}
