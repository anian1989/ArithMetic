package com.fanhanfei.synchronizedstudy.L;

public class Run {

	public static void main(String[] args) {
		
		Thread a = new Thread(new Runnable(){
			@Override
			public void run() {
				Service.printA();				
			}
		});
		a.start();
		
		Thread b = new Thread(new Runnable(){
			@Override
			public void run() {
				Service.printB();				
			}
		});

		b.start();
	}

}
