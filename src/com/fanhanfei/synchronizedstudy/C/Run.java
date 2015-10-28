package com.fanhanfei.synchronizedstudy.C;

public class Run {
	//在使用同一个实例时，利用synchronized的方法是顺序执行的
	public static void main(String[] args) {
		HasSelfPrivateNum numRef = new HasSelfPrivateNum();
		ThreadA threadA = new ThreadA(numRef);
		threadA.start();
		ThreadB threadB = new ThreadB(numRef);
		threadB.start();
	}
}
