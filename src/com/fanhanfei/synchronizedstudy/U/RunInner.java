package com.fanhanfei.synchronizedstudy.U;

import com.fanhanfei.synchronizedstudy.U.OutClass1.InnerClass1;
import com.fanhanfei.synchronizedstudy.U.OutClass1.InnerClass2;

public class RunInner {

	public static void main(String[] args) {

		final InnerClass1 in1 = new InnerClass1();
		final InnerClass2 in2 = new InnerClass2();
		
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				in1.method1(in2);
			}
		},"T1");
		
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				in1.method2();
			}
		},"T2");
		
		Thread t3 = new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				in2.method1();
			}
		},"T3");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
