package com.fanhanfei.synchronizedstudy.M;
/**
* @ClassName: Service 
* @Description: 同步synchronized（class）代码块的作用其实和
* synchronized static方法的作用一样。
* @author junshuaizhang@163.com
* @date 2015年11月6日 下午2:23:08 
*
 */
public class Service {

	public static void printA(){
		synchronized (Service.class) {
			System.out.println("线程名称为："+Thread.currentThread().getName()
					+"在 "+System.currentTimeMillis()+"进入printA");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("线程名称为："+Thread.currentThread().getName()
					+"在 "+System.currentTimeMillis()+"离开printA");
		}
	}
	
	synchronized public  void printB(){
		synchronized (Service.class) {
			System.out.println("线程名称为："+Thread.currentThread().getName()
					+"在 "+System.currentTimeMillis()+"进入printB");
			System.out.println("线程名称为："+Thread.currentThread().getName()
					+"在 "+System.currentTimeMillis()+"离开printB");
		}
		
}
}
