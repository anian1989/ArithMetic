package com.fanhanfei.synchronizedstudy.G1;
/**
 * 
* @ClassName: Main 
* @Description: 可重入锁支持在父子类继承的环境中
* @author junshuaizhang@163.com
* @date 2015年10月29日 下午5:33:26 
*
 */
public class Main {

	public int i = 10;
	synchronized public void operateIMainMethod(){
		try {
			i--;
			System.out.println("main print i="+i);
			Thread.sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
