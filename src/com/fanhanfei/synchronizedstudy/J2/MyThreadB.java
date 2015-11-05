package com.fanhanfei.synchronizedstudy.J2;

public class MyThreadB extends Thread {

	private MyList list;
	public MyThreadB(MyList list){
		super();
		this.list=list;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			list.add("threadA"+(i+1));
			
		}
	}

}
