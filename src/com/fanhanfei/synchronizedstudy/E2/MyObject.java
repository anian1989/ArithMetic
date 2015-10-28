package com.fanhanfei.synchronizedstudy.E2;
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
		System.out.println("A end time="+System.currentTimeMillis());
	}
	
	//某个线程如果已经持有synchronized的锁，不会影响其他线程对非synchronized方法的调用
	public  void methodB(){
		System.out.println("begin method B threadname="+Thread.currentThread().getName()+"  begintime="+System.currentTimeMillis());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("B end time="+System.currentTimeMillis());
	}
}
