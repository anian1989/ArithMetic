package com.fanhanfei.synchronizedstudy.G1;

public class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		sub.operateISubMethod();
	}
}
