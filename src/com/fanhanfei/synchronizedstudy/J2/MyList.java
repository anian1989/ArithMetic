package com.fanhanfei.synchronizedstudy.J2;

import java.util.ArrayList;
import java.util.List;

/**
* @ClassName: MyList 
* @Description: 验证多个线程调用同一个方法是随机的
* @author junshuaizhang@163.com
* @date 2015年11月5日 下午6:26:05 
*
 */
public class MyList {

	private List list = new ArrayList();
	synchronized public void add(String userName){
		System.out.println("ThreadName="+Thread.currentThread().getName()+"执行了add方法");
		list.add(userName);
		System.out.println("ThreadName="+Thread.currentThread().getName()+"退出了add方法");
	}
	
	
	synchronized public int getSize(){
		System.out.println("ThreadName="+Thread.currentThread().getName()+"执行了getSize方法");
		int sizeValue = list.size();
		System.out.println("ThreadName="+Thread.currentThread().getName()+"退出了getSize方法");
		return sizeValue;
	}
}
