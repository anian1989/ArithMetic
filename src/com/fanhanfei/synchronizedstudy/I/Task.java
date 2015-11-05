package com.fanhanfei.synchronizedstudy.I;
/**
* @ClassName: Task 
* @Description: 验证同步synchronized(this)代码块时锁定当前对象
* @author junshuaizhang@163.com
* @date 2015年11月3日 下午6:26:50 
*
 */
public class Task {

	synchronized public void otherMethod(){//通过加和不加synchronized可测试出
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
