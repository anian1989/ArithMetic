package com.fanhanfei.synchronizedstudy.G;

public class MyThread extends Thread{

	public void run(){
		Service service = new Service();
		service.service1();
	}
	
}
