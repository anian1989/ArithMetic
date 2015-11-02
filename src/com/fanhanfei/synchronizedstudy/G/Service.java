package com.fanhanfei.synchronizedstudy.G;
/**
 * 
* @ClassName: Service 
* @Description: 关键字synchronized拥有锁重入的功能，也就是在使用synchronized时，
* 当一个线程得到一个对象锁后，再次请求此对象锁时是可以再次得到该对象的锁的。这也证明在一个synchronized
* 方法/块的内部调用本类的其他synchronized方法/块时，是 永远可以得到锁的。
* @author junshuaizhang@163.com
* @date 2015年10月29日 下午4:22:41 
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
