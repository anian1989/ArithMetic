package com.fanhanfei.synchronizedstudy.N;
/**
 * 
* @ClassName: Service 
* @Description: 关于String的常量池特性
* @author junshuaizhang@163.com
* @date 2015年11月6日 下午5:54:58 
*
 */
public class Service {

	public static void print(String stringParam){
		try {
			synchronized (stringParam) {
				while(true){
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
