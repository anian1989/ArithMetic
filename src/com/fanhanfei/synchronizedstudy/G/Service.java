package com.fanhanfei.synchronizedstudy.G;
/**
 * 
* @ClassName: Service 
* @Description: �ؼ���synchronizedӵ��������Ĺ��ܣ�Ҳ������ʹ��synchronizedʱ��
* ��һ���̵߳õ�һ�����������ٴ�����˶�����ʱ�ǿ����ٴεõ��ö�������ġ���Ҳ֤����һ��synchronized
* ����/����ڲ����ñ��������synchronized����/��ʱ���� ��Զ���Եõ����ġ�
* @author junshuaizhang@163.com
* @date 2015��10��29�� ����4:22:41 
*
 */
public class Service {

	synchronized public void service1(){
		System.out.println("service1");
		service2();
	}
	
	synchronized public void service2(){
		System.out.println("service2");
		service3();
	}
	 synchronized public void service3(){
		 System.out.println("service3");
	 }
}
