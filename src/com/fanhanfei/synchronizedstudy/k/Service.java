package com.fanhanfei.synchronizedstudy.k;

public class Service {

	public void testMethod1(MyObject object){
		synchronized (object) {
			try {
				System.out.println("testMethod1 _getLock time="
						+System.currentTimeMillis()+" run ThreadName="
						+Thread.currentThread().getName());
				Thread.sleep(5000);
				object.speedPrintString();
				System.out.println("testMethod1 releaseLock time="
						+System.currentTimeMillis()+" run ThreadName="
						+Thread.currentThread().getName());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
