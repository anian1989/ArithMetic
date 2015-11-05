package com.fanhanfei.synchronizedstudy.J1;
/**
* @ClassName: Service 
* @Description: synchronized(非this对象x）同步代码块 
* 1、在多个线程持有“对象监视器”为同一个对象的前提下，同一个时间只有一个线程可以执行synchronized(非this对象x）同步代码块的代码；
* 2、当持有“对象监视器”为同一个对象的前提下，同一个时间只有一个线程可以执行synchronized（非this对象x）同步代码块中的代码。
* @author junshuaizhang@163.com
* @date 2015年11月5日 下午5:44:12 
*
 */
public class Service {

	private String usernameParam;
	private String passwordParam;
	
	public void setUsernamePassword(String username,String password){
		try {
			String anyString = new String();//将变量置为局部变量，运行结果变成了异步
			synchronized (anyString) {
			
				System.out.println("线程名称为："+Thread.currentThread().getName()
						+"在"+System.currentTimeMillis()+"进入同步块");
				usernameParam = username;
				Thread.sleep(3000);
				passwordParam = password;
				System.out.println("线程名称为："+Thread.currentThread().getName()
						+"在"+System.currentTimeMillis()+"离开同步块");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
