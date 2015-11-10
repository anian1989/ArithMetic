package com.fanhanfei.synchronizedstudy.U;
/**
 * 
* @ClassName: OutClass 
* @Description: 内置类的synchronized，锁定不同的监视器
* @author junshuaizhang@163.com
* @date 2015年11月9日 下午7:21:51 
*
 */
public class OutClass {

	static class Inner{
		public void method1(){
			synchronized ("其他的锁") {
				for (int i = 0; i < 11; i++) {
					System.out.println(Thread.currentThread().getName() + " i="+i);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
		}
		public synchronized void method2(){
			for (int i = 0; i < 21; i++) {
				System.out.println(Thread.currentThread().getName()+" i="+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
