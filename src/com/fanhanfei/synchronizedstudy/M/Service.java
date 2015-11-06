package com.fanhanfei.synchronizedstudy.M;
/**
* @ClassName: Service 
* @Description: ͬ��synchronized��class��������������ʵ��
* synchronized static����������һ����
* @author junshuaizhang@163.com
* @date 2015��11��6�� ����2:23:08 
*
 */
public class Service {

	public static void printA(){
		synchronized (Service.class) {
			System.out.println("�߳�����Ϊ��"+Thread.currentThread().getName()
					+"�� "+System.currentTimeMillis()+"����printA");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("�߳�����Ϊ��"+Thread.currentThread().getName()
					+"�� "+System.currentTimeMillis()+"�뿪printA");
		}
	}
	
	synchronized public  void printB(){
		synchronized (Service.class) {
			System.out.println("�߳�����Ϊ��"+Thread.currentThread().getName()
					+"�� "+System.currentTimeMillis()+"����printB");
			System.out.println("�߳�����Ϊ��"+Thread.currentThread().getName()
					+"�� "+System.currentTimeMillis()+"�뿪printB");
		}
		
}
}
