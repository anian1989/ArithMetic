package com.fanhanfei.synchronizedstudy.L;
/**
* @ClassName: Service 
* @Description:  �ؼ���synchronized������Ӧ����static��̬�����ϣ��������д�����ǶԵ�ǰ*.java
* �ļ���Ӧ��Class����г���
* @author junshuaizhang@163.com
* @date 2015��11��6�� ����2:05:20 
*
 */
public class Service {

	synchronized public static void printA(){
		try {
			System.out.println("�߳�����Ϊ��"+Thread.currentThread().getName()
					+"�� "+System.currentTimeMillis()+"����printA");
			Thread.sleep(3000);
			System.out.println("�߳�����Ϊ��"+Thread.currentThread().getName()
					+"�� "+System.currentTimeMillis()+"�뿪printA");
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	synchronized public static void printB(){
			System.out.println("�߳�����Ϊ��"+Thread.currentThread().getName()
					+"�� "+System.currentTimeMillis()+"����printB");
			System.out.println("�߳�����Ϊ��"+Thread.currentThread().getName()
					+"�� "+System.currentTimeMillis()+"�뿪printB");
	}
}
