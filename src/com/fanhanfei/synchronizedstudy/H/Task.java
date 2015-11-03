package com.fanhanfei.synchronizedstudy.H;
/**
* @ClassName: Task 
* @Description: synchronized声明方法的弊端：时间过长
* @author junshuaizhang@163.com
* @date 2015年11月2日 下午2:29:59 
*
 */
public class Task {

	private String getData1;
	private String getData2;
	public synchronized void doLongTimeTask(){
		try {
			System.out.println("begin task");
			Thread.sleep(3000);
			getData1 = "长时间处理任务后从远程返回的值1 threadName="
					+Thread.currentThread().getName();
			getData2 = "长时间处理任务后从远程返回的值2 threadName="
					+Thread.currentThread().getName();
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
