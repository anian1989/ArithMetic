package com.fanhanfei.synchronizedstudy.E;
//Ϊ��֤���߳������Ƕ���
public class MyObject {

	//�Ӳ���synchronized�ؼ��ֶ���������Ӱ��
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
