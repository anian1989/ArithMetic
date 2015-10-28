package com.fanhanfei.synchronizedstudy.B;

/**
 * 
 * @ClassName: HasSelfPrivateNum
 * @Description: 公用一个变量时，是存在“非线程安全”问题的
 * @author junshuaizhang@163.com
 * @date 2015年10月27日 下午5:27:40
 * 
 */
public class HasSelfPrivateNum {

	private int num = 0;
	public void addI(String username) {
		try {
			if (username.equals("a")) {
				num = 100;
				System.out.println("a set over");

				Thread.sleep(2000);
			}else{
				num = 200;
				System.out.println(" b set over");
			}
			System.out.println(username +" num=" + num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
