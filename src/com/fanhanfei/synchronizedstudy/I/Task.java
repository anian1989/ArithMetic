package com.fanhanfei.synchronizedstudy.I;
/**
* @ClassName: Task 
* @Description: ��֤ͬ��synchronized(this)�����ʱ������ǰ����
* @author junshuaizhang@163.com
* @date 2015��11��3�� ����6:26:50 
*
 */
public class Task {

	synchronized public void otherMethod(){//ͨ���ӺͲ���synchronized�ɲ��Գ�
		System.out.println("-------------run -------------");
	}
	
	public void doLongTimeTask(){
		synchronized(this){
			for(int i=0;i<10000;i++){
				System.out.println("synchronized threadName="
						+Thread.currentThread().getName() + " i="+(i+1));
				
			}
		}
	}
	
}
