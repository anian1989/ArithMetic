package com.fanhanfei.synchronizedstudy.U;

import com.fanhanfei.synchronizedstudy.U.OutClass.Inner;

public class RunOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Inner inner = new Inner();
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				inner.method1();				
			}
		});
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				inner.method2();				
			}
		});
		t1.start();
		t2.start();
	}

}
