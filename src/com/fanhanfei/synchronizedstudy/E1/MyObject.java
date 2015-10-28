package com.fanhanfei.synchronizedstudy.E1;
//为了证明线程锁的是对象
public class MyObject {

	//加不加synchronized关键字对输出结果有影响
	public synchronized void methodA(){
		System.out.println("begin method A threadname="+Thread.currentThread().getName()+"  begintime="+System.currentTimeMillis());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("method A end threadname="+Thread.currentThread().getName()+"  time="+System.currentTimeMillis());
	}
	
	//某个线程如果已经持有synchronized的锁，其他线程对synchronized其他方法的调用也要等待
	public synchronized void methodB(){
		System.out.println("begin method B threadname="+Thread.currentThread().getName()+"  begintime="+System.currentTimeMillis());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("method B end threadname="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
	}
}
