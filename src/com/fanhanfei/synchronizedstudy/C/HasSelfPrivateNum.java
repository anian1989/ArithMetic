package com.fanhanfei.synchronizedstudy.C;

/**
 * 
 * @ClassName: HasSelfPrivateNum
 * @Description: ����һ������ʱ���Ǵ��ڡ����̰߳�ȫ�������,����synchronized����ʵ��
 * @author junshuaizhang@163.com
 * @date 2015��10��27�� ����5:27:40
 * 
 */
public class HasSelfPrivateNum {

	private int num = 0;
	public synchronized void addI(String username) {
		try {
			if (username.equals("a")) {
				num = 100;
				System.out.println("a set over");

				Thread.sleep(2000);
			}else{
				num = 200;
				System.out.println(" b set over");
			}
			System.out.println(username +" num=" + num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
