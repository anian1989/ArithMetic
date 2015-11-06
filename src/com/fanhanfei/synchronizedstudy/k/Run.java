package com.fanhanfei.synchronizedstudy.k;

public class Run {

	public static void main(String[] args) {
		
		final Service service = new Service();
		final MyObject myObject = new MyObject();
		Thread a = new Thread(new Runnable(){
			@Override
			public void run() {				
				service.testMethod1(myObject);
			}
		});
		a.setName("a");
		a.start();

		
		Thread b = new Thread(new Runnable(){
			@Override
			public void run() {				
				myObject.speedPrintString();
			}
		});
		b.setName("b");
		b.start();
	}

}
