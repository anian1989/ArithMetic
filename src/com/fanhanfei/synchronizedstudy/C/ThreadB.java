package com.fanhanfei.synchronizedstudy.C;

public class ThreadB extends Thread {

	private HasSelfPrivateNum numRef;
	public ThreadB(HasSelfPrivateNum numRef){
		super();
		this.numRef = numRef;
	}
	public void run(){
		super.run();
		numRef.addI("b");
	}
}
