package com.fanhanfei.synchronizedstudy.A;

/**
 * 
 * @ClassName: HasSelfPrivateNum
 * @Description: �����ڲ�����һ������ʱ���ǲ����ڡ����̰߳�ȫ�������
 * @author junshuaizhang@163.com
 * @date 2015��10��27�� ����5:27:40
 * 
 */
public class HasSelfPrivateNum {

	public void addI(String username) {
		try {
			int num = 0;
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
