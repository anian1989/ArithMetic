package com.fanhanfei.synchronizedstudy.H2;

public class Run {

	public static void main(String[] args) {
		Task task = new Task();
		MyThread1 myThread1 = new MyThread1(task);
		myThread1.start();
		MyThread2 myThread2 = new MyThread2(task);
		myThread2.start();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*long beginTime = CommonUtils.beginTime1;
		if(CommonUtils.beginTime2 < CommonUtils.beginTime1){
			beginTime = CommonUtils.beginTime2;
		}*/
		long beginTime = CommonUtils.beginTime2 < CommonUtils.beginTime1 ? CommonUtils.beginTime2: CommonUtils.beginTime1;
		long endTime = CommonUtils.endTime1;
		if(CommonUtils.endTime2 > CommonUtils.endTime1){
			endTime = CommonUtils.endTime2;
		}
		System.out.println("ºÄÊ±£º"+((endTime- beginTime)/1000));
	}

}
