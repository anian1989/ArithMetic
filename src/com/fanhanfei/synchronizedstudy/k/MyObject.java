package com.fanhanfei.synchronizedstudy.k;

import com.sun.swing.internal.plaf.synth.resources.synth;

/**
* @ClassName: MyObject 
* @Description: ����synchronized(��this����x��ͬ������飬
* �������߳�ִ��x������synchronizedͬ�������ǳ�ͬ��Ч��.(ע�����̨����ķ��������߳�����)
* @author junshuaizhang@163.com
* @date 2015��11��5�� ����7:19:02 
*
 */
public class MyObject {
	synchronized public void speedPrintString(){
		System.out.println("speedPrintString _getLock time="
				+System.currentTimeMillis()+" run ThreadName="
				+Thread.currentThread().getName());
		System.out.println("-----------------------");
		System.out.println("speedPrintString releaseLock time="
				+System.currentTimeMillis()+" run ThreadName="
				+Thread.currentThread().getName());
	}
}
