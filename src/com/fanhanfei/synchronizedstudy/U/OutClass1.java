package com.fanhanfei.synchronizedstudy.U;
/**
 * 
* @ClassName: OutClass1 
* @Description: 内置类与同步:
* 同步代码块synchronized（class2）对class2上锁后，
* 其他线程只能以同步的方式调用class2中的静态同步方法
* @author junshuaizhang@163.com
* @date 2015年11月10日 上午10:19:00 
*
 */
public class OutClass1 {

	static class InnerClass1{
		public void method1(InnerClass2 class2){
			String threadName = Thread.currentThread().getName();
			synchronized (class2) {
				System.out.println(threadName + " 进入InnerClass1类中的method1方法");
				for (int i = 0; i < 10; i++) {
					System.out.println("i="+i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(threadName + " 离开InnerClass1类中的method1方法");
			}
		}
		public void method2(){
			String threadName = Thread.currentThread().getName();
				System.out.println(threadName + " 进入InnerClass1类中的method2方法");
				for (int i = 0; i < 10; i++) {
					System.out.println("j="+i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println(threadName + " 离开InnerClass1类中的method2方法");
			}
		}
	}
	
	static class InnerClass2{
		public synchronized void method1(){
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " 进入InnerClass2类中的method1方法");
			for (int i = 0; i < 10; i++) {
				System.out.println("k="+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(threadName + " 离开InnerClass2类中的method1方法");
		}
	}
}
