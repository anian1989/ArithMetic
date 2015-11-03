package com.fanhanfei.synchronizedstudy.H2;
/**
* @ClassName: Task 
* @Description: synchronized声明方法的弊端：时间过长;此处使用同步块,但是在非同步块中的变量会有同步问题
* @author junshuaizhang@163.com
* @date 2015年11月2日 下午2:29:59 
*
 */
public class Task {

	private String getData1;
	private String getData2;
	public  void doLongTimeTask(){
		try {
			System.out.println("begin task");
			Thread.sleep(3000);
			String getData1temp = "长时间处理任务后从远程返回的值1 threadName="
					+Thread.currentThread().getName();
			String getData2temp = "长时间处理任务后从远程返回的值2 threadName="
					+Thread.currentThread().getName();
			synchronized(this){
				getData1 = getData1temp;
				getData2 = getData2temp;
			}
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
