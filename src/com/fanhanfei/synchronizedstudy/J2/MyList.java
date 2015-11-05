package com.fanhanfei.synchronizedstudy.J2;

import java.util.ArrayList;
import java.util.List;

/**
* @ClassName: MyList 
* @Description: ��֤����̵߳���ͬһ�������������
* @author junshuaizhang@163.com
* @date 2015��11��5�� ����6:26:05 
*
 */
public class MyList {

	private List list = new ArrayList();
	synchronized public void add(String userName){
		System.out.println("ThreadName="+Thread.currentThread().getName()+"ִ����add����");
		list.add(userName);
		System.out.println("ThreadName="+Thread.currentThread().getName()+"�˳���add����");
	}
	
	
	synchronized public int getSize(){
		System.out.println("ThreadName="+Thread.currentThread().getName()+"ִ����getSize����");
		int sizeValue = list.size();
		System.out.println("ThreadName="+Thread.currentThread().getName()+"�˳���getSize����");
		return sizeValue;
	}
}
