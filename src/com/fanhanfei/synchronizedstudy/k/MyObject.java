package com.fanhanfei.synchronizedstudy.k;

import com.sun.swing.internal.plaf.synth.resources.synth;

/**
* @ClassName: MyObject 
* @Description: 对于synchronized(非this对象x）同步代码块，
* 当其他线程执行x对象中synchronized同步方法是呈同步效果.(注意控制台输出的方法名和线程名称)
* @author junshuaizhang@163.com
* @date 2015年11月5日 下午7:19:02 
*
 */
public class MyObject {
	synchronized public void speedPrintString(){
		System.out.println("speedPrintString _getLock time="
				+System.currentTimeMillis()+" run ThreadName="
				+Thread.currentThread().getName());
		System.out.println("-----------------------");
		System.out.println("speedPrintString releaseLock time="
				+System.currentTimeMillis()+" run ThreadName="
				+Thread.currentThread().getName());
	}
}
