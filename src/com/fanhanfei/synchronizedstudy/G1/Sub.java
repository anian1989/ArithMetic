package com.fanhanfei.synchronizedstudy.G1;

public class Sub extends Main {

	public synchronized void operateISubMethod() {
		// TODO Auto-generated method stub
		try {
			while(i>0){
				i--;
				System.out.println("sub print i="+i);
				Thread.sleep(100);
				//���ø���ķ���
				this.operateIMainMethod();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
