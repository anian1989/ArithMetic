package com.fanhanfei.synchronizedstudy.E1;
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
		System.out.println("method A end threadname="+Thread.currentThread().getName()+"  time="+System.currentTimeMillis());
	}
	
	//ĳ���߳�����Ѿ�����synchronized�����������̶߳�synchronized���������ĵ���ҲҪ�ȴ�
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
