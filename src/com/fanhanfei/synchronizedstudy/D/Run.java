package com.fanhanfei.synchronizedstudy.D;
//synchronized取得的锁都是对象锁
public class Run {

	//本示例由于创建了2个业务对象，在系统中产生出2个锁，所以运行结果是异步的
	public static void main(String[] args) {
		HasSelfPrivateNum numRefA = new HasSelfPrivateNum();
		HasSelfPrivateNum numRefB = new HasSelfPrivateNum();
		ThreadA threadA = new ThreadA(numRefA);
		threadA.start();
		ThreadB threadB = new ThreadB(numRefB);
		threadB.start();
	}
}
