package com.fanhanfei.synchronizedstudy.H4;
/**
 * 
* @ClassName: ObjectService 
* @Description: synchronized�������ͬ����
* ��ʹ��ͬ��synchronized(this)�����ʱ��Ҫע����ǣ���һ���̷߳���Object��һ��synchronized(this)ͬ�������ʱ��
* �����̶߳�ͬһ��Object����������synchronized(this)ͬ�������ķ��ʽ�����������˵��synchronizedʹ�õġ��������������һ����
* @author junshuaizhang@163.com
* @date 2015��11��3�� ����3:37:22 
*
 */
public class ObjectService {

	public void serviceMethodA(){
		try {
			synchronized(this){
				System.out.println("A begin time="+System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("A end   time="+System.currentTimeMillis());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void serviceMethodB(){
		synchronized(this){
			System.out.println("B begin time="+System.currentTimeMillis());
			System.out.println("B end   time="+System.currentTimeMillis());
		}
	}
}
