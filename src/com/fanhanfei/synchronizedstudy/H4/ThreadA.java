package com.fanhanfei.synchronizedstudy.H4;

public class ThreadA extends Thread {

	private ObjectService service;
	public ThreadA(ObjectService service){
		super();
		this.service = service;
	}
	
	public void run(){
		super.run();
		service.serviceMethodA();
	}
}
