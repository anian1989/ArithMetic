package com.fanhanfei.synchronizedstudy.G2;
/**
 * 
* @ClassName: Main 
* @Description: ͬ�������Լ̳�
* @author junshuaizhang@163.com
* @date 2015��10��30�� ����2:47:23 
*
 */
public class Main {

	synchronized public void serviceMethod(){
		try {
			System.out.println(" int main ��һ�� sleep begin threadName="
					+Thread.currentThread().getName()+" time="
					+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println(" int main ��һ�� sleep end threadName="
					+Thread.currentThread().getName()+" time="
					+System.currentTimeMillis());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
