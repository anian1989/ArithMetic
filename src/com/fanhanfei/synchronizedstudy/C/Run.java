package com.fanhanfei.synchronizedstudy.C;

public class Run {
	//��ʹ��ͬһ��ʵ��ʱ������synchronized�ķ�����˳��ִ�е�
	public static void main(String[] args) {
		HasSelfPrivateNum numRef = new HasSelfPrivateNum();
		ThreadA threadA = new ThreadA(numRef);
		threadA.start();
		ThreadB threadB = new ThreadB(numRef);
		threadB.start();
	}
}
