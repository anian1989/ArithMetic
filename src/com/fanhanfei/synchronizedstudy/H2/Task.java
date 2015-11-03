package com.fanhanfei.synchronizedstudy.H2;
/**
* @ClassName: Task 
* @Description: synchronized���������ı׶ˣ�ʱ�����;�˴�ʹ��ͬ����,�����ڷ�ͬ�����еı�������ͬ������
* @author junshuaizhang@163.com
* @date 2015��11��2�� ����2:29:59 
*
 */
public class Task {

	private String getData1;
	private String getData2;
	public  void doLongTimeTask(){
		try {
			System.out.println("begin task");
			Thread.sleep(3000);
			String getData1temp = "��ʱ�䴦��������Զ�̷��ص�ֵ1 threadName="
					+Thread.currentThread().getName();
			String getData2temp = "��ʱ�䴦��������Զ�̷��ص�ֵ2 threadName="
					+Thread.currentThread().getName();
			synchronized(this){
				getData1 = getData1temp;
				getData2 = getData2temp;
			}
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
