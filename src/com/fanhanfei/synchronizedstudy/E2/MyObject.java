package com.fanhanfei.synchronizedstudy.E2;
//Ϊ��֤���߳������Ƕ���
public class MyObject {

	//�Ӳ���synchronized�ؼ��ֶ���������Ӱ��
	public synchronized void methodA(){
		System.out.println("begin method A threadname="+Thread.currentThread().getName()+"  begintime="+System.currentTimeMillis());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("A end time="+System.currentTimeMillis());
	}
	
	//ĳ���߳�����Ѿ�����synchronized����������Ӱ�������̶߳Է�synchronized�����ĵ���
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
