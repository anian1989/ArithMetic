package com.fanhanfei.synchronizedstudy.H1;
/**
 * 
* @ClassName: ObjectService 
* @Description: synchronized同步代码块的使用
* @author junshuaizhang@163.com
* @date 2015年11月2日 下午7:06:50 
*
 */
public class ObjectService {

	public void serviceMethod(){
		try {
			synchronized(this){
				System.out.println("begin time="+System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("end time="+System.currentTimeMillis());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
