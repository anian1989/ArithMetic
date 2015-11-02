package com.fanhanfei.synchronizedstudy.G2;
/**
 * 
* @ClassName: Main 
* @Description: 同步不可以继承
* @author junshuaizhang@163.com
* @date 2015年10月30日 下午2:47:23 
*
 */
public class Main {

	synchronized public void serviceMethod(){
		try {
			System.out.println(" int main 下一步 sleep begin threadName="
					+Thread.currentThread().getName()+" time="
					+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println(" int main 下一步 sleep end threadName="
					+Thread.currentThread().getName()+" time="
					+System.currentTimeMillis());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
