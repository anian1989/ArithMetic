package com.fanhanfei.synchronizedstudy.G1;
/**
 * 
* @ClassName: Main 
* @Description: ��������֧���ڸ�����̳еĻ�����
* @author junshuaizhang@163.com
* @date 2015��10��29�� ����5:33:26 
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
