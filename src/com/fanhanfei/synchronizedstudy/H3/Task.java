package com.fanhanfei.synchronizedstudy.H3;

public class Task {

	public void doLongTimeTask(){
		for (int i = 0; i < 10; i++) {
			System.out.println("nosynchronized threadName="
					+Thread.currentThread().getName()+" j="+(i+1));
		}
		System.out.println("");
		synchronized(this){
			for (int i = 0; i < 10; i++) {
				System.out.println("nosynchronized threadName="
						+Thread.currentThread().getName()+" i="+(i+1));
			}
		}
	}
}
