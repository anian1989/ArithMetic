package com.fanhanfei.synchronizedstudy.J3;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyOneList myOneList = new MyOneList();
		MyThread1 myThread1 = new MyThread1(myOneList);
		myThread1.setName("A");
		myThread1.start();

		MyThread2 myThread2 = new MyThread2(myOneList);
		myThread2.setName("B");
		myThread2.start();
		
		Thread.sleep(6000);
		System.out.println("listsize="+myOneList.getSize());//本来结果应该是1 的 结果是2
	}

}
