package com.fanhanfei.synchronizedstudy.G2;

public class MyThreadA extends Thread {

	private Sub sub;
	public MyThreadA(Sub sub){
		super();
		this.sub = sub;
	}
	
	public void run(){
		sub.serviceMethod();
	}
}
