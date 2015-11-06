package com.fanhanfei.synchronizedstudy.M;

public class Run {

	public static void main(String[] args) {
		final Service service1 = new Service();
		final Service service2 = new Service();

		Thread a = new Thread(new Runnable(){
			@Override
			public void run() {
				service1.printA();
				
			}
		});
		a.setName("A");
		a.start();
		Thread b = new Thread(new Runnable(){
			@Override
			public void run() {
				service2.printB();
				
			}
		});
		b.setName("B");
		b.start();
	}

}
