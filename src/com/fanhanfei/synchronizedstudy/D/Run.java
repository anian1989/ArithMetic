package com.fanhanfei.synchronizedstudy.D;
//synchronizedȡ�õ������Ƕ�����
public class Run {

	//��ʾ�����ڴ�����2��ҵ�������ϵͳ�в�����2�������������н�����첽��
	public static void main(String[] args) {
		HasSelfPrivateNum numRefA = new HasSelfPrivateNum();
		HasSelfPrivateNum numRefB = new HasSelfPrivateNum();
		ThreadA threadA = new ThreadA(numRefA);
		threadA.start();
		ThreadB threadB = new ThreadB(numRefB);
		threadB.start();
	}
}
