package com.fanhanfei.synchronizedstudy.G2;

public class MyThreadB extends Thread {

	private Sub sub;
	public MyThreadB(Sub sub){
		super();
		this.sub = sub;
	}
	
	public void run(){
		sub.serviceMethod();
	}
}
