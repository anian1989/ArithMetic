package com.fanhanfei.synchronizedstudy.H;
/**
* @ClassName: Task 
* @Description: synchronized���������ı׶ˣ�ʱ�����
* @author junshuaizhang@163.com
* @date 2015��11��2�� ����2:29:59 
*
 */
public class Task {

	private String getData1;
	private String getData2;
	public synchronized void doLongTimeTask(){
		try {
			System.out.println("begin task");
			Thread.sleep(3000);
			getData1 = "��ʱ�䴦��������Զ�̷��ص�ֵ1 threadName="
					+Thread.currentThread().getName();
			getData2 = "��ʱ�䴦��������Զ�̷��ص�ֵ2 threadName="
					+Thread.currentThread().getName();
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
