package com.fanhanfei.synchronizedstudy.H4;
/**
 * 
* @ClassName: ObjectService 
* @Description: synchronized代码块间的同步性
* 在使用同步synchronized(this)代码块时需要注意的是，当一个线程访问Object的一个synchronized(this)同步代码块时，
* 其他线程对同一个Object中所有其他synchronized(this)同步代码块的访问将被阻塞，这说明synchronized使用的“对象监视器”是一个。
* @author junshuaizhang@163.com
* @date 2015年11月3日 下午3:37:22 
*
 */
public class ObjectService {

	public void serviceMethodA(){
		try {
			synchronized(this){
				System.out.println("A begin time="+System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("A end   time="+System.currentTimeMillis());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void serviceMethodB(){
		synchronized(this){
			System.out.println("B begin time="+System.currentTimeMillis());
			System.out.println("B end   time="+System.currentTimeMillis());
		}
	}
}
