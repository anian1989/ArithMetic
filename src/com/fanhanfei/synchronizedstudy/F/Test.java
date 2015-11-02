package com.fanhanfei.synchronizedstudy.F;

public class Test {

	public static void main(String[] args) {
		PublicVar publicVar = new PublicVar();
		ThreadA thread = new ThreadA(publicVar);
		thread.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		publicVar.getValue();

	}

}
