package com.fanhanfei.synchronizedstudy.E;
//为了证明线程锁的是对象
public class MyObject {

	//加不加synchronized关键字对输出结果有影响
	public synchronized void methodA(){
		System.out.println("begin method A threadname="+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
